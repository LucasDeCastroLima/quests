class BinarySearch(list: Array[Int]) {

    def find(x: Int, len: Int, count: Int): Int = {
        var aux  = len
        var plus = count
        var elem: Int = list(aux)

        if(elem == x){
            println("Valor: "+ elem +" Key: "+ aux);
            return 0;
        }else if(x > elem){
            var vl = Math.round(aux - (aux / 2))
            if(vl > 1)
                vl /= 2
            aux += vl
        }else if(x < elem){
            var vl = Math.round(aux - (aux / 2))
            if(vl > 1)
                vl /= 2
            aux -= vl
        }

        if(count > list.length){
            println("Resultado não encontrado")
            return 1;
        }else{
            plus = count + 1
            find(x, aux, plus);
        }

    }

    def getLenght(): Int = {
        return (list.length - 1) / 2;
    }

}

var list = Array(2,9,20,30,56,556,565)
var binary = new BinarySearch(list)
var result = binary.find(93, binary.getLenght, 0)
