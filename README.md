# Challenge: Mock Transactions
## Resolução do [case][case] proposto por @GuiaBolso para backend develop

## O que vamos precisar?

* JDK 8+
* Gradle 3.6.3 ou superior
* Git

## Como executar a aplicação?

### Github

1. Clone o repositório no seu diretório local.
    1. Utilize o comando: git clone https://github.com/luizhdteixeira/challenge-mock-transacoes.git

### Projeto

1. Execução do projeto
    1. Abra o seu terminal/prompt e garanta estar no diretório, em: `\challenge-mock-transacoes\mock-transacoes`
    2. Execute os comandos Gradle Spring Boot: `./gradlew bootRun` ou `gradlew bootRun`
   
## API: Mock Transacoes

### URI - Ambientes
Local: localhost:8080/<id>/transacoes/<ano>/<mes>

Obs.: Se preferir não rodar os passos anteriores.
Heroku: https://challenge-mock-transactions.herokuapp.com/<id>/transacoes/<ano>/<mes>

### PathVariables
* id: deve ser um número inteiro que contém no mínimo 4 e no máximo 6 dígitos entre os valores entre 1000 e 999999.
* ano: deve ser um número inteiro que contém no mínimo e no máximo 4 dígitos entre os valores entre 1000 e 2020.
* mes: deve ser um número inteiro que contém no mínimo 1 e no máximo 2 dígitos entre os valores 1 e 12.

### Header
`{ Content-Type: application/json }`

### Response: Body

* Sucesso:

`[
{
"descricao": "Tarifa Bancária",
"data": 1578670676462,
"valor": 1234
}
]`

* Insucesso:

`{
"status": 400,
"timestamp": "2020-12-20T17:02:37.413+00:00",
"detailMessage": "findByParamsTransactions.month: must be less than or equal to 12",
"description": "uri=/1234/transacoes/2020/13"
}`


## Conclusão

* Fico a disposição para dúvidas e aberto para melhorias, sinta-se à vontade para enviar pull requests.
   * Solicitação de melhorias: [Clique aqui][Melhoria] 

   
[Melhoria]: https://github.com/luizhdteixeira/challenge-mock-transacoes/issues
[case]: https://github.com/luizhdteixeira/seja-um-guia-back
