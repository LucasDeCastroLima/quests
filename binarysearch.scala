class BinarySearch(list: Array[Int]) {

    def find(x: Int): Int = {
        return findKey(x, getLenght(), 0)
    }

    def findKey(x: Int, len: Int, count: Int): Int = {
        var aux       = len
        var plus      = count
        var elem: Int = list(aux)
        var vl        = 0

        if(elem == x){
            return aux;
        }else if(x > elem){
            vl = (aux - (aux / 2))
            if(vl > 1)
                vl /= 2
        }else if(x < elem){
            vl = (aux - (aux / 2))
            if(vl > 1)
                vl /= 2
        }

        if(count > list.length){
            return -1;
        }else{
            plus = count + 1
            findKey(x, (aux - vl), plus);
        }

    }
    def getLenght(): Int = {
        return (list.length - 1) / 2;
    }
}

var list = Array(2,9,20,30,56,556,565)
var binary = new BinarySearch(list)
var result = binary.find(58)
println(result)
