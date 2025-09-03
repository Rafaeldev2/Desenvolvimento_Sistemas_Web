const express = require('express');
const app = express();
const port = 3000;

app.use(express.json());

let projetos = [];

app.get('/projetos', (req, res) => {
  res.json(tasks);
});+

app.post("/projetos", (req, res) => {
  const projeto = req.body;
  projetos.push(projeto);
  res.json(projeto)
});

app.put('/projetos/:id', (req, res) => {
  const id = req.params.id;
  const updatedProjeto = req.body;
  projetos = projetos.map(projeto => {
    if(projeto.id == id){
        return {...projetos, titulo: updatedProjeto.titulo }
    }
    return projeto;
  })
  res.json(updatedProjeto);
});

app.delete('/projetos/:id', (req, res) => {
  const id = req.params.id;
  projetos = projetos.filter(projeto => projeto.id != id )
  
  res.json({ message: 'Projeto deletado' });
});

app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
  });