# RMI (REMOTE METHOD INVOCATION) em Java
Código desenvolvido em java para a disciplina de Laboratório de Sistemas Distribuídos no período 2022.4.

# Biblioteca utilizada para Criptografia e descriptografia
Jasypt (http://www.jasypt.org/)

# Execução
Primeiro de tudo faça a extração do arquivo .jar presente na pasta /lib/ e, em seguida, mova a pasta "org" (dentro da pasta extraída) para dentro da pasta /src/. Após, execute os comandos abaixo no cliente e no servidor.

## SERVIDOR
## 1º Terminal
```
javac *.java
```

```
rmic CriptografiaIMP
```

```
rmiregistry 1099
```
Obs.: Porta passada no rmiregistry deve ser diferente da porta do ServerCripto.

## 2º Terminal
```
java ServerCripto
```

## CLIENTE
```
javac *.java
```
```
java ClientCripto
```
Obs.: Porta passado no ClientCripto deve ser a mesma porta passada no rmiregistry.

# Observações
- Comandos utilizados para execução do programa funcionaram na versão 11 do JDK/JRE.
- Houve problemas para executar os comandos na versão 18 e 19.
