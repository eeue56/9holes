int f(String t, String s, int n){
   if (n < 1) return t.indexOf(s);
   
   return f(t.substring(t.indexOf(s)), s, n--);
}
