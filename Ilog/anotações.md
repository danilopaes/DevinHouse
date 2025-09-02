# Comandos Git

- **git init**: inicializa um repositório Git local.  
- **git clone**: clona um repositório remoto para um diretório local.  
- **git status**: mostra o status da *working tree* (quais arquivos estão modificados ou na *staging area*).  
- **git add**: adiciona arquivos à *staging area*.  
- **git commit -m "mensagem"**: registra os arquivos da *staging area* em um commit.  
  - Caso a mensagem seja deixada em branco, será aberto o editor padrão para adicioná-la.  
- **git log**: exibe o histórico de commits.  
- **git remote add origin remote-repository.git**: adiciona o repositório remoto com o nome `origin`.  
- **git remote show origin**: exibe detalhes do repositório remoto `origin`.  
- **git push**: envia os commits locais para o repositório remoto.  
- **git pull**: obtém as últimas atualizações do branch atual a partir do repositório remoto.  
  - É um atalho para `fetch + merge`.  
- **git fetch origin**: busca as últimas alterações de um branch do repositório remoto sem mesclá-las.  
