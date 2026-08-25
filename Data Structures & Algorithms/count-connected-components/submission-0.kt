class Solution {
    fun countComponents(n: Int, edges: Array<IntArray>): Int {
        val parent = IntArray(n) {it}
    var count = n
    fun find(x : Int) : Int {
        if(x != parent[x]) {
            parent[x] = find(parent[x])
        }
        return parent[x]
    }

    fun union(x :Int, y : Int) : Boolean {
        val px = find(x)
        val py = find(y)

        if (px == py) return false
        parent[px] = py
        return true
    }

    for ((u,v) in edges) {
        if (union(u,v)) count--
    }
    return count
    }
}
