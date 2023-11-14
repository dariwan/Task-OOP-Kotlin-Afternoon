package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    val test  = divideZero(10, 0)
    println(test)

}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

fun divideZero(a: Int, b: Int) : Any {
    return try {
        a/b
        println("Hasil dari: "+ a / b)
    }catch(e:Exception){
        println(e)
        "Pembagian dengan 0 tidak diperbolehkan"
    }
}
