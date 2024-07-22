# Banco Digital Com Java - Projeto desenvolvido para o Bootcamp da DIO
# DigiBank

## Projeto DigiBank

O DigiBank é um sistema bancário simples desenvolvido em Java, que permite a gestão de contas correntes e poupanças para clientes. Este projeto inclui funcionalidades para adicionar, remover e exibir contas, além de operações bancárias como saque, depósito, transferência e impressão de extratos.

## Funcionalidades

- Adicionar novo conta
- Remover conta
- Exibir todos as contas cadastrados
- Realizar operações bancárias (saque, depósito, transferência)
- Imprimir extratos de contas

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- `Main.java`: Classe principal que contém o menu de interação com o usuário.
- `Banco.java`: Classe que gerencia a lista de clientes.
- `Cliente.java`: Classe que representa um cliente do banco.
- `Conta.java`: Classe abstrata que define a estrutura básica de uma conta bancária.
- `ContaCorrente.java`: Classe que herda de `Conta` e representa uma conta corrente.
- `ContaPoupanca.java`: Classe que herda de `Conta` e representa uma conta poupança.
- `IConta.java`: Interface que define os métodos principais de uma conta bancária.
