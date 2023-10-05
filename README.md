# TesteQualidade-ExercicioCaixaBranca

1ª Etapa

Após a análise do código apresentado os seguintes erros foram notados:
- Não possui comentários documentando o código
- Métodos e declaração de variáveis estão misturados no código.
- Certas identações dificultam o entendimento do código
- Várias exceções não são tratadas
- A conexão feita no método verificarUsuario não é fechado após executar a query.


2ª Etapa

Aplicando o uso do grafo de fluxo no código de exemplo conseguimos o seguinte resultado:
![Grafo de Fluxo - Teste de Caixa Branca](https://github.com/EduardoHS-ZWrld/TesteQualidade-ExercicioCaixaBranca/assets/69911011/c1d339d3-1085-46c1-b789-0960ad70141a)

No arquivo user.java foi adicionado a classe UserGrafoFluxo com o mesmo código da classe User porém identado e com comentários marcando os nódulos para facilitar a visualização;

Seguindo a fórmula apresentada
  V(G) = 24 arestas - 22 nódulos + 
A complexidade do Grafo ficou em 4, assim resultando em 4 caminhos independentes. Seriam esses:
 - Caminho feliz: Todos os resultados são Sucessos ou verdadeiros
 - Erro no nódulo 7: A tentativa de conexão resulta em falha e cai no exception. Finalizando o código em erro.
 - Erro no nódulo 14: A execução da query resulta em falha e cai no exception. Finalizando o código em erro.
 - Nódulo 15 retorna false: O resultado da query não possui valor, pulando do nódulo 15 para o 18.
