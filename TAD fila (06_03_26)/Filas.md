# Filas - Descrição 📑
A fila é um Tipo Abstrato de Dado do estilo FIFO (First-in/First out), o que significa que o primeiro elemento a entrar será exatamente o primeiro a sair, indicando uma ordem no tratamento dos dados. 
  
Trata-sede um estilo especial de lista linear, onde as remoções são feitas pelo início da fila enquanto, as inserções no fim da fila. O que significa também que sua complexidade é de O(1), 
uma vez que o elemento manipulado sempre será o primeiro da lista.
  
Alguns exemplos de filas que podemos nos deparar no dia a dia são: filas de banco, filas de mercado, filas de atendimento, entre outras.

<img width="919" height="652" alt="image" src="https://github.com/user-attachments/assets/7178a000-7639-4106-807f-4fdced98c391" />

---
# Operações Básicas 🛠️
Para a manipulação de filas em Java, temos alguns comandos básicos para utilizar:

– Fila( ): construtor que inicia a fila deixando-a vazia

– qIsEmpty( ): verifica se a fila está vazia retornando verdadeiro se vazia e falso caso contrário

– qIsFull( ): verifica se a fila está cheia retornando verdadeiro se cheia e falso caso contrário

– enqueue( e ): insere o elemento 'e' no final da fila 

– dequeue( ): retira o elemento que está no início da fila retornando o seu valor

– front( ): retorna o elemento que está no início da fila, sem remover

– rear( ): retorna o elemento que está no final da fila, sem remover

– size( ): retorna o número de elementos presentes na fila
