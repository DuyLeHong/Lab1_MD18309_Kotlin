package com.duyle.lab1_md18309

fun main () {
    // khai báo va su dung lambda function
    val soA : Int? = 5
    val soB : Int? = 10
    val tong = tinhTong(soA!!, soB!!)
    println("Tong 2 so $soA va $soB = $tong")

    println("Hieu 2 so $soA va $soB = ${tinhHieu(soA, soB)}")

    println("Binh phuong $soA = ${binhPhuong(soA)}")

    println("Thuong 2 so $soA va $soB = ${tinhThuong(soA.toFloat(), soB.toFloat()) ()}")

    val tenSV = "nguyen van long"
    println("In hoa chuoi $tenSV = ${inHoa(tenSV)}")
}

val inHoa: (String) -> String = String::uppercase


val tinhTong : (Int, Int) -> Int
        = {soA: Int, soB: Int -> (soA + soB)}

val tinhHieu = {soA: Int, soB: Int -> (soA - soB)}

val binhPhuong : (Int) -> Int = {it * it}

val tinhThuong = {soA: Float, soB: Float -> {
        if (soB == 0f) {
            "so bi chia phai khac 0!"
        } else {
            val c = soA / soB
            c
        }

    }
}




