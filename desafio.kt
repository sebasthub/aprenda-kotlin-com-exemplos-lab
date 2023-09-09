enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String, val senha: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).") 
        inscritos.add(usuario)
    }
    
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val usuario1 = Usuario("sebas","super123")
    val conteudo = ConteudoEducacional("jão educas", 120)
    var list = mutableListOf<ConteudoEducacional>()
    list.add(conteudo)
    val formacao = Formacao("supremo", list)
    formacao.matricular(usuario1)
    println(formacao)
    println(formacao.inscritos)
}