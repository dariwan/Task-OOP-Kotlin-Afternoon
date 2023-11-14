package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName = "Dariwan"
    val lastName = "Dariwan"
    val age = 23
    val status = false

    println("Nama Depan: ${firstName}")
    println("Nama Belakang: ${lastName}")
    println("Umur: ${age}")
    println("Status: ${status} (single atau tidak)")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    return "Group ID ${groupId}, Group Member ${groupMember}, Session ${session}"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupMember = listOf(
        "Gina Salma Sabilla",
        "Syauqillah Hadie Ahsana",
        "Ahmad Maulana",
        "Dariwan",
        "Alysa Syakirah",
        "Muhammad Thoriq Al-Faruq",
        "Luthfi Dwi Syah Putra",
        "Moch Iqbal Arizki Widyansyakh",
        "Adhim Tanfitra",
        "Faris Muzhafar",
        "Khoirun Nisa Bisyaroh",
        "Ena Nurhalizah",
    )
    return groupMember
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Shania", "Kak Kelvin", "Kak Iffan")
    val countOfGroup = myTeam().size

    return mentor.size + countOfGroup
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("11.11", myTeam(), "Afternoon")

}