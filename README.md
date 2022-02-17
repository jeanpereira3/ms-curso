# ms-curso

Fase 1: Comunicação simples, Feign, Ribbon /n
1.1 Criar projeto hr-worker /n
1.2 Implementar projeto hr-worker /n
Script SQL /n

INSERT INTO tb_worker (name, daily_Income) VALUES ('Bob', 200.0); /n
INSERT INTO tb_worker (name, daily_Income) VALUES ('Maria', 300.0); /n
INSERT INTO tb_worker (name, daily_Income) VALUES ('Alex', 250.0); /n
application.properties /n

spring.application.name=hr-worker /n
server.port=8001 /n

# Database configuration /n
spring.datasource.url=jdbc:h2:mem:testdb /n
spring.datasource.username=sa /n
spring.datasource.password= /n

spring.h2.console.enabled=true /n
spring.h2.console.path=/h2-console /n

1.3 Criar projeto hr-payroll /n
application.properties /n

spring.application.name=hr-payroll /n
server.port=8101 /n
1.4 Implementar projeto hr-payroll (mock) /n