//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
 println("Ввудите количество точек")
    val kolvo = readln().toInt()

val Xtochk = mutableListOf<Double>()
val Ytochk = mutableListOf<Double>()
    for (i in 1..kolvo) {
println("Введите координату X точки №${i}:")
Xtochk.add(readln().toDouble())
 println("Введите координату Y точки №${i}:")
 Ytochk.add(readln().toDouble())
    }
val pochka = Tochka(Xtochk,Ytochk)


}