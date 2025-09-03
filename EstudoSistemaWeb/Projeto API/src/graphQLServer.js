const express = require('express');
const { graphqlHTTP } = require('express-graphql');
const { buildSchema } = require('graphql');

// Defina seu esquema GraphQL
const schema = buildSchema(`
  type Projeto {
    id: ID!
    title: String!
    author: Author!
    category: Category!
  }
`);


let projetos = []

const root = {
    projetos: () => projetosData
  };
  
  // Configuração do servidor express com GraphQL
  const app = express();
  app.use('/graphql', graphqlHTTP({
    schema: schema,
    rootValue: root,
    graphiql: true, // Habilita a interface gráfica para testar queries
  }));
  
  const port = 3000;
  app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
  });