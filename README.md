# Api E-commerce
API desenvolvida durante o treinamento If Black, then Code (IBM & Gama Academy), durante as aulas sobre Spring Boot do Prof. Isidro Massetto.

## Modelagem de dados
![187266904-e1786323-2ee3-47b4-92b0-3c25697e2c46](https://user-images.githubusercontent.com/91769337/192124731-f1f59884-4dff-4834-974f-f766c56a7a16.png)

## Error codes
**404 - Bad Request**
Dados enviados de forma incorreta ou fora do padrão.

## Departamentos
Endpoints de departamentos.

### GET Listar departamentos: localhost:8080/departamentos
Rota utilizada para listar todos os departamentos cadastrados no sistema.

#### Exemplo de requisição
curl --location --request GET 'localhost:8080/departamentos

#### Exemplo de resposta
[
{
"codigo": 1,
"nome": "Informática",
"descricao": "Acessorios, utilitários e eletrônicos"
},<br>
{
"codigo": 2,
"nome": "Vestuário",
"descricao": "Moda feminina, masculina e infantil"
}
]

### POST Cadastrar departamentos: localhost:8080/departamentos
Rota para cadastrar novos departamentos no sistema.

#### Requisição
* nome
* descrição

#### Exemplo de requisição
curl --location --request POST 'localhost:8080/departamentos' \
--data-raw '{
        "nome": "Vestuário",
        "descricao": "Moda feminina, masculina e infantil"
    }'
    
#### Exemplo de resposta
**HTTP Status 200** <br>
{
"codigo": 2,
"nome": "Vestuário",
"descricao": "Moda feminina, masculina e infantil"
}

### PUT Atualizar departamento: localhost:8080/departamentos
Rota para atualizar dados de departamento.<br>
curl --location --request PUT 'localhost:8080/departamentos' \
--data-raw '{
    "codigo": 1,
    "nome": "Informática",
    "descricao": "Acessorios, utilitários e eletrônicos"
}'

### DEL Deletar departamento: localhost:8080/departamentos/2
Rota utilizada para excluir registros de departamentos.

#### Exemplo de requisição
curl --location --request DELETE 'localhost:8080/departamentos/2'

### GET Listar departamento por código: localhost:8080/departamentos/1
Rota para buscar departamento por codigo.

#### Exemplo de requisição
curl --location --request GET 'localhost:8080/departamentos/1'

#### Exemplo de resposta
**HTTP Status 200** <br>
{
  "codigo": 1,
  "nome": "Informática",
  "descricao": "Acessorios, utilitários e eletrônicos"
}

