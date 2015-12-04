class BinarySearch(list: Array[Int]) {

    def find(x: Int) = {
        var aux = (list.length - 1) /2
        var mit = true;
        var res = 0;
        var count = 0;
        while(mit){
            var elem: Int = list(aux)
            if(elem == x){
                res = elem;
                mit = false;
            }else if(x > elem){
                var vl = (aux - (aux / 2))
                if(vl > 1)
                    vl /= 2

                aux += vl
            }else if(x < elem){
                var vl = (aux - (aux / 2))
                if(vl > 1)
                    vl /= 2

                aux -= vl
            }

            if(count > list.length){
                return -1;
                mit = false;
            }

            count += 1
        }
        if(!(count > list.length))
            return aux
    }
}

var list = Array(2,9,20,30,56,556,565)
var binary = new BinarySearch(list)
binary.find(23)
