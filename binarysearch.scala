class BinarySearch(list: Array[Int]) {
    def find(x: Int, len: Int): Array[Int] = {
        var aux = len /2
        var elem: Int = list(aux)

        if(elem == x){
            return Array(x, aux)
        }else if(elem > x){
            aux = aux + (aux / 2)
            find(x, aux)
        }else{
            aux = aux - (aux / 2)
            find(x, aux);
        }
    }

    def getLenght(): Int = {
        return list.length - 1;
    }

    def printArr(ar: Array[Int]){
        print("Valor: ")
        print(ar(0))
        print(" Key: ")
        print(ar(1))
        println()
    }
}

var list = Array(2,9,20,30,56,556,565)
var binary = new BinarySearch(list)
var result = binary.find(30, binary.getLenght)
binary.printArr(result)
