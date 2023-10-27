enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String) {
    override fun toString(): String {
        return nome
    }
}

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("$usuario matriculado na formação: $nome")
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 90)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 120)

    val formacaoKotlin = Formacao("Formação Kotlin", listOf(conteudo1, conteudo2))

    val user1 = Usuario("Alice")
    val user2 = Usuario("Bob")

    formacaoKotlin.matricular(user1)
    formacaoKotlin.matricular(user2)

    println("Inscritos na formação ${formacaoKotlin.nome}: ${formacaoKotlin.inscritos}")
}
