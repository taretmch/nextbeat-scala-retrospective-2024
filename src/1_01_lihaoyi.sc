//> using scala "3.4.2"
//> using dep "com.lihaoyi::requests:0.8.3"

val res = requests.get("https://nextbeat.co.jp")

println(res)
