## Mock de API com json-server

Este projeto utiliza a biblioteca **json-server** para criar rapidamente uma API mock a partir de um arquivo **`.json`**.  
Com isso, é possível simular endpoints RESTful de forma simples, facilitando o desenvolvimento e os testes sem a necessidade de um backend real.

### 🔧 Como funciona
- Um arquivo `mock.json` (ou equivalente) define os dados da API.
- O **json-server** interpreta esse arquivo e gera automaticamente os endpoints para uso da API.
- Os endpoints ficam disponíveis localmente como em uma API real.

### ▶️ Exemplo de uso
```bash
json-server file.json -h ip_adress -p port
