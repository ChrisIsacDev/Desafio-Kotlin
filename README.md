# Desafio-Kotlin

# README - Desafio de Desenvolvimento em Kotlin

Este desafio envolve o desenvolvimento de um sistema educacional em Kotlin, onde os principais componentes são: Nivel, Usuario, ConteudoEducacional, e Formacao. O objetivo é criar objetos e simular a matrícula de usuários em formações educacionais.

## Componentes

Nivel: Enumeração que representa os níveis de dificuldade, com opções de BASICO, INTERMEDIARIO e DIFICIL.

Usuario: Classe que representa os usuários que podem se inscrever em formações. Cada usuário tem um nome.

ConteudoEducacional: Classe que representa o conteúdo educacional, com um nome e duração em minutos.

Formacao: Classe que representa uma formação educacional, contendo um nome, uma lista de conteúdos educacionais e uma lista de usuários inscritos. Ela possui um método matricular para inscrever um usuário na formação.

## Solução

Para resolver o desafio, a solução implementa a criação de objetos dessas classes e a simulação de matrículas de usuários em formações. Aqui estão os passos da solução:

Definir as classes e enumerações necessárias com os atributos apropriados.

Implementar o método matricular na classe Formacao para adicionar um usuário à lista de inscritos.

No método main, criar objetos das classes Usuario, ConteudoEducacional, e Formacao.

Simular matrículas de usuários nas formações usando o método matricular.

Exibir os resultados na saída padrão, incluindo a lista de inscritos em uma formação.

## Exemplo de Uso

kotlin
Copy code
val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 90)
val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 120)

val formacaoKotlin = Formacao("Formação Kotlin", listOf(conteudo1, conteudo2))

val user1 = Usuario("Alice")
val user2 = Usuario("Bob")

formacaoKotlin.matricular(user1)
formacaoKotlin.matricular(user2)

println("Inscritos na formação ${formacaoKotlin.nome}: ${formacaoKotlin.inscritos}")
Neste exemplo, criamos uma formação chamada "Formação Kotlin" com dois conteúdos educacionais. Matriculamos dois usuários, Alice e Bob, na formação, e exibimos a lista de inscritos.

## Conclusão

Este desafio demonstra o uso de classes, objetos e enumerações em Kotlin para modelar um sistema educacional simples. Ele também ilustra como realizar a matrícula de usuários em formações educacionais. Essa solução pode ser estendida e aprimorada para construir um sistema educacional mais completo, com mais recursos e funcionalidades.
