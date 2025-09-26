# Git Básico - Terminal

## 1. Clonar repositório remoto (uma vez)

```bash
git clone https://github.com/usuario/repositorio.git
cd repositorio
2. Adicionar arquivos ao repositório
Copie ou crie o arquivo dentro da pasta do repositório

3. Verificar branch atual
bash
Copiar código
git branch
4. Preparar arquivo para commit (staging area)
bash
Copiar código
git add "nome do arquivo com espaço.txt"
# ou
git add arquivo.txt
5. Salvar as mudanças localmente (commit)
bash
Copiar código
git commit -m "Mensagem explicando a mudança"
6. Enviar para o repositório remoto (push)
bash
Copiar código
git push origin nome-da-branch
Exemplo:

bash
Copiar código
git push origin main
Comandos úteis adicionais
Ver status atual (arquivos modificados, não adicionados, etc.)

bash
Copiar código
git status
Ver histórico resumido de commits

bash
Copiar código
git log --oneline
Criar e mudar para uma nova branch

bash
Copiar código
git checkout -b nome-da-branch
Mudar para outra branch existente

bash
Copiar código
git checkout nome-da-branch
Dicas
Use aspas para arquivos com espaços: git add "arquivo com espaço.txt"

Sempre cheque o status antes de commitar: git status