# ms-curso

# Fase 1: Comunicação simples, Feign, Ribbon

### 1.1 Criar projeto hr-worker

### 1.2 Implementar projeto hr-worker

Script SQL
```sql
INSERT INTO tb_worker (name, daily_Income) VALUES ('Bob', 200.0);
INSERT INTO tb_worker (name, daily_Income) VALUES ('Maria', 300.0);
INSERT INTO tb_worker (name, daily_Income) VALUES ('Alex', 250.0);
```

application.properties
```
spring.application.name=hr-worker
server.port=8001

# Database configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

### 1.3 Criar projeto hr-payroll

application.properties
```
spring.application.name=hr-payroll
server.port=8101
```

### 1.4 Implementar projeto hr-payroll (mock)

### 1.5 RestTemplate

### 1.6 Feign

### 1.7 Ribbon load balancing

Run configuration
```
-Dserver.port=8002
```

# Fase 2: Eureka, Hystrix, Zuul

### 2.1 Criar projeto hr-eureka-server

### 2.2 Configurar hr-eureka-server

Porta padrão: 8761

Acessar o dashboard no navegador: http://localhost:8761

### 2.3 Configurar clientes Eureka
Eliminar o Ribbon de hr-payroll:
```
Dependência Maven
Annotation no programa principal
Configuração em application.properties
```

### 2.4 Random port para hr-worker
server.port=${PORT:0}

eureka.instance.instance-id=${spring.application.name}:${spring.application.instance_id:${random.value}}

### 2.5 Tolerância a falhas com Hystrix

### 2.6 Timeout de Hystrix e Ribbon

hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds=60000

ribbon.ConnectTimeout=10000

ribbon.ReadTimeout=20000

### 2.7 Criar projeto hr-zuul-server

### 2.8 Configurar hr-zuul-server
Porta padrão: 8765

### 2.9 Random port para hr-payroll