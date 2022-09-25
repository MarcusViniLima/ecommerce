# Api E-commerce
API desenvolvida durante o treinamento If Black, then Code (IBM & Gama Academy), durante as aulas sobre Spring Boot do Prof. Isidro Massetto.

## Modelagem de dados
![187266904-e1786323-2ee3-47b4-92b0-3c25697e2c46](https://user-images.githubusercontent.com/91769337/192124731-f1f59884-4dff-4834-974f-f766c56a7a16.png)

## Error codes
**404 - Bad Request**
Dados enviados de forma incorreta ou fora do padrão.

## Departamentos
Endpoints de departamentos.

## GET Listar departamentos: localhost:8080/departamentos
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

## POST Cadastrar departamentos: localhost:8080/departamentos
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

## PUT Atualizar departamento: localhost:8080/departamentos
Rota para atualizar dados de departamento.<br>
curl --location --request PUT 'localhost:8080/departamentos' \
--data-raw '{
    "codigo": 1,
    "nome": "Informática",
    "descricao": "Acessorios, utilitários e eletrônicos"
}'

## DEL Deletar departamento: localhost:8080/departamentos/2
Rota utilizada para excluir registros de departamentos.

#### Exemplo de requisição
curl --location --request DELETE 'localhost:8080/departamentos/2'

## GET Listar departamento por código: localhost:8080/departamentos/1
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
## Produtos
Endpoints de produtos.

## POST Cadastrar Produto: localhost:8080/produtos
Rota para salvar novo produto no sistema.

**Requisição**
* nome
* descricao
* preco
* estoque
* linkFoto
* departamento

#### Exemplo de resposta
**HTTP Status 200**
{
    "codigo": 3,
    "nome": "Cabo HDMI",
    "descricao": "Cabo para monitores, TVs e computadores",
    "preco": 50.0,
    "estoque": 10,
    "linkFoto": "caboHDMI.png",
    "departamento": {
        "codigo": 1,
        "nome": null,
        "descricao": null
    }
}

#### Exemplo de requisição
 {
        "nome": "Notebook i7 16 Gb Ram 500Gb HD SSD",
        "descricao": "Notebook Ultima Geração",
        "preco": 3850,
        "estoque": 5,
        "linkFoto": "notebook.jpg",
        "departamento": {
            "codigo": 1
        }
    }
    
## GET Listar produtos: localhost:8080/produtos
Rota para listar todos os produtos registrados no sistema.

#### Exemplo de requisição
curl --location --request GET 'localhost:8080/produtos'

#### Exemplo de resposta
**HTTP Status 200**<br>
[
    {
        "codigo": 1,
        "nome": "Cabo HDMI",
        "descricao": "Cabo para monitores, TVs e computadores",
        "preco": 50.0,
        "estoque": 10,
        "linkFoto": "caboHDMI.png",
        "departamento": {
            "codigo": 1,
            "nome": "Informática",
            "descricao": "Acessorios, utilitários e eletrônicos"
        }
    },<br>
    {
        "codigo": 2,
        "nome": "Computaodr i9 32Gb Ram 1TbHD, Placa GTX1090",
        "descricao": "Computador Ultima Geração",
        "preco": 4000.0,
        "estoque": 3,
        "linkFoto": "computador.jpg",
        "departamento": {
            "codigo": 1,
            "nome": "Informática",
            "descricao": "Acessorios, utilitários e eletrônicos"
        }
    },<br>
    {
        "codigo": 3,
        "nome": "Notebook i7 16 Gb Ram 500Gb HD SSD",
        "descricao": "Notebook Ultima Geração",
        "preco": 3850.0,
        "estoque": 5,
        "linkFoto": "notebook.jpg",
        "departamento": {
            "codigo": 1,
            "nome": "Informática",
            "descricao": "Acessorios, utilitários e eletrônicos"
        }
    }
]
## GET Listar produto por código: localhost:8080/produtos/1
Rota para buscar produto por id.

#### Exemplo de requisição
curl --location --request GET 'localhost:8080/produtos/1'

#### Exemplo de resposta
**HTTP Status 200**<br>
{
    "codigo": 1,
    "nome": "Cabo HDMI",
    "descricao": "Cabo para monitores, TVs e computadores",
    "preco": 50.0,
    "estoque": 10,
    "linkFoto": "caboHDMI.png",
    "departamento": {
        "codigo": 1,
        "nome": "Informática",
        "descricao": "Acessorios, utilitários e eletrônicos"
    }
}

## PUT Atualizar Produto: localhost:8080/produtos/1
Rota para autualizar os dados de um produto.

#### Exemplo de resposta
**HTTP Status 200**<br>
{
  "codigo": 1,
  "nome": "Cabo HDMI",
  "descricao": "Cabo para monitores, TVs e computadores",
  "preco": 50,
  "estoque": 10,
  "linkFoto": "caboHDMI.png",
  "departamento": {
    "codigo": 1,
    "nome": null,
    "descricao": null
  }
}

#### Exemplo de requisçao
{
    "codigo": 1,
    "nome": "Cabo HDMI",
    "descricao": "Cabo para monitores, TVs e computadores",
    "preco": 50,
    "estoque": 10,
    "linkFoto": "caboHDMI.png",
    "departamento": {
        "codigo": 1
    }
}

## DEL Deletar produto: localhost:8080/produtos/1
#### Exemplo de requisição
curl --location --request DELETE 'localhost:8080/produtos/1'

## Pedidos
Endpoints de pedidos.

## POST Realizar pedido: localhost:8080/pedidos
Rota para registrar novo pedido no sistema.

**Requisição**
* nome
* descricao
* preco
* estoque
* linkFoto
* departamento

#### Exemplo de resposta
**HTTP Status 200**<br>
{
    "numero": 19,
    "data": "2022-08-16",
    "valorBruto": 2400.0,
    "desconto": 100.0,
    "valorFinal": 2300.0,
    "status": "N",<br>
    "cliente": {
        "id": 3,
        "nome": null,
        "email": null,
        "senha": null,
        "registroGeral": null,
        "cpf": null
    },<br>
    "itens": [
        {
            "numSeq": 19,
            "quantidade": 2,
            "valorUnitario": 1200.0,
            "valorTotal": 2400.0,
            "produto": {<br>
                "codigo": 6,
                "nome": null,
                "descricao": null,
                "preco": null,
                "estoque": null,
                "linkFoto": null,
                "departamento": null
            }
        }
    ]
}

## Exemplo de requisição
{
    "cliente": {
        "id": 3
    },<br>
    "valorBruto": 2400.00,
    "desconto": 100.0,
    "valorFinal": 2300.0,
    "data" : "2022-08-16",
    "status": "N",
    "itens": [<br>
        {
            "produto": {
                "codigo": 6
            },
            "valorUnitario": 1200.0,
            "quantidade": 2,
            "valorTotal": 2400
        }
    ]
}

## GET Listar pedidos: localhost:8080/pedidos
Rota para listar todos os pedidos existentes no banco de dados da aplicação.

#### Exemplo de requisição
[
    {
        "numero": 1,
        "data": "2021-01-10",
        "valorBruto": 4000.0,
        "desconto": 0.0,
        "valorFinal": 4000.0,
        "status": "F",
        "cliente": {<br>
            "id": 1,
            "nome": "Jose Alberto Neves",
            "email": "josealberto@mail.com",
            "senha": "123456",
            "registroGeral": "98.876.123-99",
            "cpf": "987.654.321-00"
        },<br>
        "itens": [
            {
                "numSeq": 1,
                "quantidade": 1,
                "valorUnitario": 4000.0,
                "valorTotal": 4000.0,
                "produto": {<br>
                    "codigo": 1,
                    "nome": "Computaodr i9 32Gb Ram 1TbHD, Placa GTX1090",
                    "descricao": "Computador Ultima Geração",
                    "preco": 4000.0,
                    "estoque": 3,
                    "linkFoto": "computador.jpg",
                    "departamento": {<br>
                        "codigo": 1,
                        "nome": "Informática",
                        "descricao": "Utilitários, acessórios e eletrônicos"
                    }
                }
            }
        ]
    },
    {
        "numero": 2,
        "data": "2021-02-01",
        "valorBruto": 70.0,
        "desconto": 0.0,
        "valorFinal": 70.0,
        "status": "F",
        "cliente": {<br>
            "id": 2,
            "nome": "Antonio Oliveira",
            "email": "antoniooli@mail.com",
            "senha": "987654",
            "registroGeral": "12.983.256-72",
            "cpf": "765.432.987.10"
        },<br>
        "itens": [
            {
                "numSeq": 2,
                "quantidade": 2,
                "valorUnitario": 35.0,
                "valorTotal": 70.0,
                "produto": {<br>
                    "codigo": 4,
                    "nome": "Conector USB para recarga em tomada 3A",
                    "descricao": "Conector USB",
                    "preco": 35.0,
                    "estoque": 15,
                    "linkFoto": "conector.jpg",
                    "departamento": {<br>
                        "codigo": 1,
                        "nome": "Informática",
                        "descricao": "Utilitários, acessórios e eletrônicos"
                    }
                }
            }
        ]
    }
 ]
 
## GET Listar pedido por código: localhost:8080/pedidos/3
Rota para buscar pedido por ID.

#### Exemplo de requisição
curl --location --request GET 'localhost:8080/pedidos/3'

#### Exemplo de resposta
{
    "numero": 3,
    "data": "2021-03-10",
    "valorBruto": 3850.0,
    "desconto": 0.0,
    "valorFinal": 3850.0,
    "status": "F",
    "cliente": {<br>
        "id": 3,
        "nome": "Regina Brito",
        "email": "reginabrito@mail.com",
        "senha": "010203",
        "registroGeral": "83.235.645-90",
        "cpf": "123.456.789-00"
    },<br>
    "itens": [
        {
            "numSeq": 3,
            "quantidade": 1,
            "valorUnitario": 3850.0,
            "valorTotal": 3850.0,
            "produto": {<br>
                "codigo": 2,
                "nome": "Notebook i7 16 Gb Ram 500Gb HD SSD",
                "descricao": "Notebook Ultima Geração",
                "preco": 3850.0,
                "estoque": 5,
                "linkFoto": "notebook.jpg",
                "departamento": {<br>
                    "codigo": 1,
                    "nome": "Informática",
                    "descricao": "Utilitários, acessórios e eletrônicos"
                }
            }
        }
    ]
}
