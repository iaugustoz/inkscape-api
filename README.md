# 📖 **Inkscape** 📖

## 📜 **Descrição**

⚙️ Descrição em andamento...

---

## 🚀 **Status do Projeto**

🔧 Em desenvolvimento...

---

## 💻 **Tecnologias Utilizadas**

O projeto utiliza as seguintes tecnologias:

- **Java** (v21.0.0) - Linguagem principal do Back-End
- **Spring Boot** (v3.4.4) - Framework para desenvolvimento ágil
- **Spring Web** - Cria aplicaçÕes web com base em Spring
- **MySQL Driver** - Banco de dados relacional
- **Spring Data JPA** - ORM para integração com o banco de dados
- **Lombok** - Redução de boilerplate no código
- **Bean Validation** - Validação de dados de entrada
- **Swagger OpenAPI** - Documenta aplicações e endpoints
- **ModelMapper** - Facilita o mapeamento de objetos (sourceObject, destinationObject)

---

## 📦 **Instalação e Execução**

Siga os passos abaixo para rodar o projeto localmente:

### **1️⃣ Clonar o repositório**

```bash
git clone https://github.com/iaugustoz/inkscape-api
```

### **2️⃣ Acessar o diretório do projeto**

```bash
cd inkscape-api
```

### **3️⃣ Configurar o banco de dados**

Certifique-se de ter o MySQL instalado.

### **4️⃣ Configurar as variáveis de ambiente**

Crie um arquivo `.env` na raiz do projeto e adicione:

```env
MYSQL_USERNAME=seu_usuario_mysql
MYSQL_PASSWOR=sua_senha_mysql
MYSQL_DATABASE=seu-banco-de-dados
```

### **5️⃣ Instalar as dependências e rodar a aplicação**

```bash
mvn clean install
mvn spring-boot:run
```

A API estará disponível em `http://localhost:8080`

---

## 🔥 **Principais Endpoints**

Abaixo estão os principais endpoints da API:

### 📌 **Autenticação**

- `POST /auth/login` → Autenticação do usuário e geração do token JWT
- `POST /auth/register` → Cadastro de um novo usuário

### 📌 **Usuários**

- `GET /users/{id}` → Buscar usuário por ID
- `PUT /users/{id}` → Atualizar dados do usuário
- `DELETE /users/{id}` → Remover usuário

### 📌 **Produtos**

- `GET /products` → Listar todos os produtos
- `GET /products/{id}` → Buscar produto por ID
- `POST /products` → Cadastrar novo produto
- `PUT /products/{id}` → Atualizar um produto existente
- `DELETE /products/{id}` → Remover produto

📌 **Mais detalhes disponíveis na documentação Swagger em:** [`http://localhost:8080/swagger-ui.html`](http://localhost:8080/swagger-ui.html)

---

## 📖 **Documentação com Swagger**

A API conta com uma documentação interativa gerada pelo **Springdoc OpenAPI**. Para acessá-la:

1. **Execute a aplicação localmente.**
2. **Acesse o Swagger UI:** [`http://localhost:8080/swagger-ui.html`](http://localhost:8080/swagger-ui.html)
3. Explore e teste os endpoints diretamente pela interface gráfica.

---

## 📜 **Changelog**

Este projeto segue um histórico de mudanças documentado no arquivo [CHANGELOG.md](./CHANGELOG.md). Consulte esse arquivo para ver as versões lançadas, novas funcionalidades, correções de bugs e melhorias.

---

## 🤝 **Contribuindo**

Se quiser contribuir com este projeto, siga estes passos:

1. **Faça um fork do repositório.**
2. **Crie uma nova branch para sua feature:**
   ```bash
   git checkout -b minha-feature
   ```
3. **Implemente suas alterações e faça um commit:**
   ```bash
   git commit -m "Minha nova feature"
   ```
4. **Envie as alterações para o repositório remoto:**
   ```bash
   git push origin minha-feature
   ```
5. **Crie um Pull Request e aguarde o feedback!** 🚀

---

## 👨‍💻 **Autor**

- **Igor Augusto**
- 📧 E-mail: [iaugustodeveloper@gmail.com](mailto:iaugustodeveloper@gmail.com)
- 🌎 [Portfólio](https://iaugusto.vercel.app/)
- 💼 [LinkedIn](https://www.linkedin.com/in/igorbrz/)
- 📷 [Instagram](https://www.instagram.com/iaugusto__/)

---

## ⚠️ **Aviso Importante**

Este projeto ainda está em desenvolvimento. Algumas funcionalidades podem estar incompletas ou sofrer alterações. Caso encontre algum problema, **sinta-se à vontade para abrir uma issue!**
