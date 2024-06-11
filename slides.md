---
theme: seriph
title: ScalaMatsuri 2024 の発表振り返り
class: text-center
highlighter: shiki
drawings:
  persist: false
transition: (slide)-left
mdc: true
layout: intro
---

# <span style="font-size: 3.5rem;">ScalaMatsuri 2024 の発表振り返り</span>

NB-Scala レトロスペクティブ (#NextMatsuri) - 2024年6月14日<br>
株式会社ネクストビート 溝上友貴

---

# 自己紹介

<div class="container">
  <div class="left">
    <ul>
      <li>ScalaMatsuri には2021年から参加 (2023年、2024年にオフライン参加 🏮)</li>
      <li>Scala は実務で触り始めて5年目</li>
      <li>Platform チームで、社内の共通ライブラリ (Scala, TypeScript, Capacitor) の開発や認証基盤の開発を担当</li>
    </ul>
  </div>
  <div class="right">
    <img src="/images/icon.png" />
    <div class="links">
      <a href="https://twitter.com/taretmch" target="_blank">@taretmch</a>
      <a href="https://github.com/taretmch" target="_blank">github</a>
    </div>
  </div>
</div>

<style scoped>
.container {
    display: flex;
}
.left {
    margin-right: 10px;
}
img {
    height: 70%;
    margin: auto;
}
.links {
    margin-top: 10px;
    text-align: center;
    color: #0077b5;
}
.links a {
    margin: 0 5px;
}
</style>

---

# 会社紹介

- 株式会社ネクストビート
- [会社紹介資料](https://speakerdeck.com/nextbeat/company-profile)
- <span v-click><span v-mark.underline.orange>人口減少社会</span>をメインテーマに、保育園/法人向け SaaS、シェアリングエコノミー、子育てメディア、保育/宿泊業界のHR求人応募システムなど様々な事業を展開している</span>
- <span v-click>Scala 2.12, Scala 2.13, Scala 3 を使って開発している</span>
- <span v-click>Scala の事業で主に扱っているドメイン</span>
  - <span v-click>労務管理、シフト管理</span>
  - <span v-click>保育</span>
  - <span v-click>スケジュール、予約管理</span>
  - <span v-click>料金計算、請求</span>
  - <span v-click>etc.</span>

---

# 本日の発表の目標

- ScalaMatsuri 2024 の発表を振り返り、実務にどう応用できるか考える
- ScalaMatsuri に行けなかったけど、行った気になれる
- 来年は参加してみたい！という気持ちになる

---

# ScalaMatsuri 2024 お疲れさまでした！

<style scoped>
.container {
    display: flex;
    width: 70%;
    margin: auto;
}
.left, .right {
    padding: 10px;
}
.left {
    flex: 1;
    display: flex;
    justify-content: center;
    align-items: center;
}
.right {
    flex: 1;
    display: flex;
    flex-direction: column;
    justify-content: space-between;
}
.right img {
    width: 100%;
    margin-bottom: 10px;
}
.left img {
    width: 100%;
    height: auto;
}
</style>

<div class="container">
  <div class="left">
    <img src="https://i-assets-io-github-taretmch.s3.ap-northeast-1.amazonaws.com/nextbeat-matsuri-2024/IMG_9993.png" />
  </div>
  <div class="right">
    <img src="https://i-assets-io-github-taretmch.s3.ap-northeast-1.amazonaws.com/nextbeat-matsuri-2024/IMG_0006.png" />
    <img src="https://i-assets-io-github-taretmch.s3.ap-northeast-1.amazonaws.com/nextbeat-matsuri-2024/IMG_9999.png" />
  </div>
</div>

---

# ScalaMatsuri 2024 の概要

- [アジア最大級の Scala カンファレンス](https://scalamatsuri.org/ja)
- 日時：2024年6月8日(土)、6月9日(日)
- 会場: 東京・台場
- <span v-mark.underline.orange>2019年以来のオフライン開催！</span>

<div class="image-container">
  <img src="/images/matsuri.png">
</div>

<style scoped>
.image-container {
  position: absolute;
  right: 50px;
  top: 100px;
}
img {
  width: 300px;
}
</style>

---

# ScalaMatsuri 2024 の感想

### 雰囲気について

- 昨年ハイブリッドでオフライン参加したが、雰囲気が全く違った
- 英語の発表も多く、グローバル！
- Scala 好きの人が集まっていて、熱気があった

<div class="image-container">
  <img src="https://i-assets-io-github-taretmch.s3.ap-northeast-1.amazonaws.com/nextbeat-matsuri-2024/IMG_0006.png" />
</div>

<style scoped>
.image-container {
  position: absolute;
  right: 50px;
  bottom: 50px;
}
img {
  height: 280px;
  margin: auto;
}
</style>

---

# ScalaMatsuri 2024 の感想

### 会場について

- 発表、質疑応答時の英語 <-> 日本語の同時通訳があって、英語が不安でも楽しめた
  - レシーバーの配布、マイクの運搬お疲れさまでした...
- 会場が広く、また、座るのが辛くなかった
- ノベルティが豪華だった
- お昼の弁当、コーヒーが美味しかった
- 懇親会 🍺

<div class="image-container">
  <img src="/images/badge.png" />
  <p>素敵な Scala のバッジも</p>
</div>

<style scoped>
.image-container {
  position: absolute;
  right: 50px;
  bottom: 50px;
}
img {
  height: 200px;
  margin: auto;
}
.image-container p {
  text-align: center;
}
</style>

---

# ScalaMatsuri 2024 の感想

### 発表について

- Scala のビルドツール、ライブラリ、エコシステムの進化を学ぶことができた
- Scala 3, scala-cli を使ったものが多かった
- Scala 3 は生産性が高い、書いていて楽しい、Scala 2 よりも理解しやすい。もっと流行らせたい
- opaque, coursier, tapir などの単語の読み方を知ることができた

|  |  |
| --- | --- |
| opaque | オペーク |
| coursier  | クルシェ |
| tapir | タピア |


---

# ScalaMatsuri 2024 の感想

### 全体的な感想

- 両日とも楽しすぎてあっという間に終わった
- 懇親会での交流も楽しかった。やはり Scala バージョン更新に苦労している方 (会社) が多かった
- 業務アプリケーションを全て Scala 3 にあげたくなった

<div class="image-container">
  <img src="/images/daiba_kirei.png">
  <img src="/images/gohan_oishii.png">
</div>

<style scoped>
.image-container {
  display: flex;
  justify-content: space-around;
  margin-top: 20px;
}
img {
  width: 40%;
}
</style>

---

# ScalaMatsuri 2024 の発表一覧 (Day 1)

- [com.lihaoyi エコシステムによる簡単Scalaプログラミング](https://www.lihaoyi.com/post/12yearsofthecomlihaoyiScalaPlatform.html)
- [Scala to WebAssembly: 動機と方法](https://speakerdeck.com/tanishiking/scala-to-webassembly-exploring-the-how-and-why)
- Project Loom の概要と Scala での有用性
- [Scala3とscala-cliでデータプロジェクトの生産性を向上させる方法](https://github.com/koljamaier/big-data-productivty-booster-scalamatsuri-2024/blob/main/slides/The%20productivity%20booster%20for%20your%20Data%20Projects%20with%20Scala3%20%26%20scala-cli.pdf)
- [record4s --- Scala 3のための拡張可能レコード、そして構造的型によるドメインモデリング](https://speakerdeck.com/tarao/record4s-extensible-records-for-scala-3-and-domain-modeling-with-structural-types)
- [日本語埋め込みモデルを Scala から使うには何が必要か.](https://speakerdeck.com/i10416/scalamatsuri2024-how-to-use-embedding-models-from-scala)
- Ironライブラリで守られた型安全性
- [数値ライブラリで始める安全なプログラミング](https://speakerdeck.com/boykush/introduction-to-safe-programming-with-numeric-library)
- PHPからScalaへ：私の経験
- [Scalaの開発者ツールエコシステム](https://slides.com/tomekgodzik/scala-ecosystem)

<!--
飛び込みカンファレンスについても口頭で紹介する
-->

---

# ScalaMatsuri 2024 の発表一覧 (Day 2)

- [Scala ビルド時間の最適化](https://speakerdeck.com/bishabosha/optimising-scala-3-build-times-scala-matsuri)
- [Property-based testing: テストライブラリ活用方法](https://slides.com/magdastozek/property-based-testing-scala-20-min)
- [実務で使えるScala初心者向けTips](https://docs.google.com/presentation/d/e/2PACX-1vSP9jbfKrRj0K4TaSCFfZGsfuufvYXI2Wx2MqVI7eHhagXstuBt0DjSF2sp6bncSA/pub)
- [作って学ぶ Extensible Effects](https://docs.google.com/presentation/d/1raybiE8Otk2nreKDyRHoF1HK50K9K-fjL8-37QK8kW4/edit)
- Ox を用いた Direct-Style Scala
- [いつ継承を使い、いつ使わないのか](https://gakuzzzz.github.io/slides/when_to_use_subtyping_when_not_to_use/#1)

<!--
飛び込みカンファレンスについても口頭で紹介する
-->

---

# com.lihaoyi エコシステムによる簡単Scalaプログラミング

- <span v-click>ライブラリ作成者 lihaoyi さんによる Scala のライブラリ群の紹介と、その歴史の話</span>
- <span v-click>Cats, ZIO などのライブラリを使わずに、Scala のコアライブラリだけでエコシステムを築き上げている</span>
- <span v-click>Python のようなシンプルな記法で書くことができるのが特徴</span>
- <span v-click>com.lihaoyi のライブラリを組み合わせることで、様々なアプリケーションを作ることができる</span>
  - <span v-click>[組み合わせの一覧 📝](https://www.lihaoyi.com/post/12yearsofthecomlihaoyiScalaPlatform.html#the-comlihaoyi-platform-has-built-out-a-third-way) (スクショはこのリンクから作成)</span>

<div v-click class="image-container">
  <img src="/images/lihaoyi-cheat-sheet.png" />
</div>

<style scoped>
.image-container {
  margin-top: 20px;
}
img {
  height: 150px;
  margin: auto;
}
</style>

---

# com.lihaoyi エコシステムによる簡単Scalaプログラミング

### 感想

- <span v-click>ライブラリ作者の方から、誕生秘話が聞けて良かった</span>
- <span v-click>2012年〜開発を継続されてきた、そのモチベーションと歴史に感銘を受けた</span>
- <span v-click>Scala にたどり着くまでに PHP, Python, Java, C#, F# 全てで作ったとのこと... すごい</span>
- <span v-click>エコシステムに感謝し、貢献していくために活用していきたい</span>
  - <span v-click>身近なところだと、Scala の研修資料に取り入れやすそう</span>

---

# Scala to WebAssembly: 動機と方法

- <span v-click>Scala で WebAssembly がサポートされる！という話</span>
- <span v-click>Scala -> Scala.js -> Wasm の仕組み</span>
- <span v-click>WasmGC の話なども</span>

<br>

<div v-click>

### 感想

- Scala でフロントエンドを書けるのはロマンがあって良い
- WebAssembly は未知の領域だが、Scala で書けるのは楽しそうと感じた

</div>

---

# Project Loom の概要と Scala での有用性

- <span v-click>OpenJDK 21 で導入された仮想スレッドの話</span>
- <span v-click>Scala では、Cats Effect, ZIO の Fiber が該当する</span>
- <span v-click>物理スレッドと違い、100万スレッドを立てても問題なく並列処理することができる</span>
  - <span v-click>物理スレッドだとエラーになる</span>
- <span v-click>JVM なので Scala でも使える</span>

<br>

<div v-click>

### 感想

- 最新の Java についてキャッチアップすることができ、勉強になった

</div>

---

# Scala3とscala-cliでデータプロジェクトの生産性を向上させる方法

- <span v-click>Scala CLI x Apache Spark x Apache Kafka x BigQuery でデータ処理を行う話</span>
- <span v-click>Scala 3 の強み</span>
  - <span v-click>Syntax</span><span v-click>, Enums</span><span v-click>, トップレベル定義</span><span v-click>, リリースサイクル</span><span v-click>, Scala CLI</span>
- <span v-click>Scala CLI によって、Spark によるデータ処理を Python のように生産性高く書くことができる</span>
- <span v-click>Scala.js のおかげで、BigQuery のユーザー定義関数を Scala で書くことができる</span>

<br>

<div v-click>

### 感想

- Apache Spark によるデータ処理のシンプルさに驚いた
- Scala.js は単にフロントエンドを書くだけでなく、JavaScript と連携するプラットフォームにおいても活用できる

</div>

---

# record4s --- Scala 3のための拡張可能レコード、そして構造的型によるドメインモデリング

- <span v-click>Scala 3 で導入された[構造的型](https://docs.scala-lang.org/scala3/book/types-structural.html)を利用して、型安全なレコードを定義するライブラリについての話</span>
- <span v-click>業務アプリケーションでは、同じようなモデルを使い回すことが多い。管理が煩雑になる問題に対するソリューション</span>

<div v-click>

```scala
import com.github.tarao.record4s.%
import com.github.tarao.record4s.circe.Codec.encoder

val r = %(name = "taretmch", age = 20)
println(r)                                     // - %(name = taretmch, age = 20)
println(r.name)                                // - taretmch
println(r.asJson.noSpaces)                     // - {"name":"taretmch","age":20}
println(r + %(email = "taretmch@example.com")) // - %(name = taretmch, age = 20, email = taretmch@example.com)
```

</div>

<!--
- 名前付きタプルのように扱うことができる
- circe, upickle などの JSON ライブラリとの連携も可能
-->

---

# record4s --- Scala 3のための拡張可能レコード、そして構造的型によるドメインモデリング

### 感想

- 構造的型の便利さを知った
- NamedTuple の良さを知ることができた
- よく request/response のデータ型を case class で量産しているが、record4s で定義することでコード量を減らせそう
  - 実際にやってみたが、Record に対する型クラスを用意すると便利だった

---

# 日本語埋め込みモデルを Scala から使うには何が必要か.

- 自然言語処理において、日本語埋め込みモデルを Scala から使用する方法についての話
- Java のライブラリを通じて、Scala で日本語埋め込みモデルに対して自然言語処理することができる

<br>

### 感想

- Python だとワンライナーでできるが、Scala でやることのロマンを感じた
- JVM のエコシステムは強みだと感じた
- 難しかった

---

# Ironライブラリで守られた型安全性

- 制約を型として表現する、Refinement type のためのライブラリ
- Scala 2 では [refined](https://github.com/fthomas/refined) が主なライブラリだった
- デフォルトでサポートされている制約が多い
- 例えば、以下のような制約を表現できる

<!-- TODO: あとで書く -->

<br>

### 感想

- require 使ってるなら Iron に書き換えた方が安全そう

---

# 数値ライブラリで始める安全なプログラミング

- [typelevel/spire](https://github.com/typelevel/spire) の紹介
- Double、BigDecimal などの数値型を扱うとき、計算途中に丸められて全体の計算精度が落ちることがある
- 途中式に精度を入れず、計算結果の出力に精度を持たせることで、安全な数値計算ができる

<br>

<div v-click>

### Rational 型

- 有理数の表現

```scala
import spire.math.Rational
import java.math.RoundingMode.HALF_UP

val `1/6` = Rational(1, 6)
println(`1/6`.toBigDecimal(5, HALF_UP))
// 0.16667
```

</div>

---

# 数値ライブラリで始める安全なプログラミング

### Real 型

- 無理数を算出する「式」を表現する
- 精度を与えると Rational 型に変換できる

```scala
import spire.math.Real
import java.math.RoundingMode.HALF_UP
println(Real(2).sqrt) // 1.4142135623730950488016887242096980785697
println(Real(2).sqrt.toRational(6)) // 45/32
println(Real(2).sqrt.toRational(6).toBigDecimal(5, HALF_UP)) // 1.40625
```

<br>

<div v-click>

- 他にも Polynomial 型 ($ax + b$ のような一次多項式)、Complex 型などがある
- Rational の JSON シリアライズは文字列にして構造を保持する

</div>

---

# 数値ライブラリで始める安全なプログラミング

### 感想

- 最近話題に上がっていただけあって盛り上がった
- 無理数の表現方法が遅延評価で面白い
  - [Inexact](https://github.com/typelevel/spire/blob/v0.18.0/core/src/main/scala/spire/math/Real.scala#L578-L589) : シンプルに表現されている
- 永続化を文字列で行って構造を保持するのは、良いアイデアと感じた
  - どうしても近似値が欲しいときは近似値を保持するカラムも用意すれば良さそう

---

# PHPからScalaへ：私の経験

- <span v-click>PHP から Scala に移行した経験談の話</span>
- <span v-click>Scala の魅力的だった点として以下の点が挙げられた</span>
  - <span v-click>Option 型の null safe</span>
  - <span v-click>パターンマッチング</span>
  - <span v-click>中置記法 (infix, 配列のコレクションメソッド)</span>
  - <span v-click>implicit の表現力 (Scala 3 だと given, using, extension, Conversion)</span>
- <span v-click>Scala を始めるためにピッタリのリンク集</span>
  - <span v-click>[GitHub](https://github.com/KristianLentino99/ScalaMatsuri2024)</span>

---

# PHPからScalaへ：私の経験

### 感想

- Scala のパターンマッチングは強い
- コレクションメソッドの高階関数は他の言語にも導入されてきていて、Scala でやっていて当たり前になっていることの良さを確認できた
- 中置記法のような記法は直感的で、コードの可読性が上がる

---

# Scalaの開発者ツールエコシステム

- Scalameta 

ポイント

- コンパイルのレイヤー (e.g. sbt -> zinc -> scalac) 、コンパイルフェーズの紹介
- 適切にプロジェクトを分割し (1プロジェクト20ファイルくらい) 依存関係を綺麗にすれば、並行ビルドによりビルド時間を短縮できる
- パイプラインビルド (Scala 3.5.0) によるビルド時間の短縮

---

# Scala ビルド時間の最適化

---

# Property-based testing: テストライブラリ活用方法

- プロパティベースのテスト
- 満たすべき性質を定義し、テストを自動生成する
- Scala のライブラリは Scalacheck
- プロパティを定義するには深いドメイン知識と一定のコツが必要
- 例を使ったテストとの使い分けが重要
- 重要なコンポーネントに対してはプロパティベースのテストを使うと良い

---

# 実務で使えるScala初心者向けTips

---

# 作って学ぶ Extensible Effects

---

# Ox を用いた Direct-Style Scala

- 手続き的な記法で並行プログラミングを行うためのライブラリ
- Go の goroutine のような記法で書ける
- Scala 未経験者の方でも直感的に書くことができるのでは

---

# いつ継承を使い、いつ使わないのか

---

# まとめ

- Scala のビルドツール、ライブラリ、エコシステムは日々進化している。その進化を実感できる場として ScalaMatsuri は最適
- 今年は、Scala の基礎から応用、コンパイラ、ライブラリまで幅広いトピックが取り上げられた
- 2019年以来のオフライン開催で、会場の雰囲気、熱気は最高だった
- Scala 3 は生産性が高い、書いていて楽しい、Scala 2 よりも理解しやすい。もっと流行らせたい
- 来年は難しい発表にも頷いて聞けるように精進する

---

# 時間余ったら: record4s と tapir の連携

- [tapir](https://github.com/softwaremill/tapir) は、エンドポイントの定義を型安全に行うためのライブラリ
- tapir は、以下のようにエンドポイントを定義する

```scala {|6,7,13,14}
import io.circe.generic.auto._
import sttp.tapir.*
import sttp.tapir.json.circe._
import sttp.tapir.generic.auto._

case class JsValuePutRecord(name: String)
case class JsValueRecord(name: String, age: Int)

// PUT /v1/record : id と name を受け取って、name と age を返すエンドポイント
val putRecord1 = endpoint
  .put
  .in("v1" / "record" / path[Long]("id"))
  .in(jsonBody[JsValuePutRecord])
  .out(jsonBody[JsValueRecord].example(JsValueRecord(name = "taretmch", age = 20)))
```

- 辛い点: <span v-mark.underline.orange>似たような request/response のデータ型が case class で量産される</span>
- tapir は弊社でも利用しており、API の request/response の定義に Record を使えないか試してみた

---

# record4s と tapir の連携

- Record を利用して、エンドポイントを以下のように変更する

```scala {|12,14,15}
import com.github.tarao.record4s.*
import com.github.tarao.record4s.circe.Codec.encoder
import com.github.tarao.record4s.circe.Codec.decoder

import sttp.tapir.*
import sttp.tapir.json.circe._
import sttp.tapir.generic.auto._

val putRecord2 = endpoint
  .put
  .in("v2" / "record" / path[Long]("id"))
  .in(jsonBody[% { val name: String }])
  .out(
    jsonBody[% { val name: String; val age: Int }]
      .example(%(name = "taretmch", age = 20))
  )
```

- これは動かない
- JSON Encoder/Decoder だけでなく、tapir の Schema という型クラスのインスタンスも必要

---

# record4s と tapir の連携

- case class の場合は `import sttp.tapir.generic.auto._` で自動的に Schema が生成された
- Record に対しては、自前で Schema を定義する必要がある

```scala
given schemaForJsValuePutRecord: Schema[% { val name: String }] = Schema(
  name       = Some(Schema.SName("JsValuePutRecord")),
  schemaType = SProduct(
    List(
      SchemaType.SProductField(FieldName("name"), Schema(SString()), _.name.some),
    )
  )
)

given schemaForJsValueRecord: Schema[% { val name: String; val age: Int }] = Schema(
  name       = Some(Schema.SName("JsValueRecord")),
  schemaType = SProduct(
    List(
      SchemaType.SProductField(FieldName("name"), Schema(SString()), _.name.some),
      SchemaType.SProductField(FieldName("age"), Schema(SInteger()), _.age.some)
    )
  )
)
```

- しんどい。

---

# record4s と tapir の連携

- Record に対して共通 Schema を定義する

```scala {|13,14,15,16|4|8,9,10|5,7,11}
private inline def encodeSchemaFields[Types, Labels, R](
  res: Builder[SProductField[R], List[SProductField[R]]] = List.newBuilder[SProductField[R]]
): Builder[SProductField[R], List[SProductField[R]]] =
  inline (erasedValue[Types], erasedValue[Labels]) match
    case _: (EmptyTuple, EmptyTuple) =>
      res
    case _: (tpe *: types, label *: labels) =>
      val labelStr = constValue[label & String]
      val schema = summonInline[Schema[tpe]]
      res += SProductField(FieldName(labelStr), schema, r => Some(r.asInstanceOf[Map[String, Any]](labelStr).asInstanceOf[tpe]))
      encodeSchemaFields[types, labels, R](res)

inline given schema[R <: %](using r: RecordLike[R]): Schema[R] =
  Schema(
    schemaType = SProduct(encodeSchemaFields[r.ElemTypes, r.ElemLabels, R]().result())
  )
```

- できた！
- Schema 名 (`JsValuePutRecord`, `JsValueRecord`) も入れられるようにしたいが、間に合わなかった...

---

# record4s と tapir の連携

- 1つの given インスタンスによって、以下のようなエンドポイントの定義が可能になった

```scala
val putRecord = endpoint
  .put
  .in("record" / path[Long]("id"))
  .in(
    jsonBody[% { val name: String }]
  )
  .out(
    jsonBody[% { val name: String; val age: Int }]
      .example(%(name = "taretmch", age = 20))
  )
```

<div class="image-container">
  <img src="/images/openapi_sample.png" />
  <p>OpenAPI の出力例</p>
</div>

<style scoped>
.image-container {
  position: absolute;
  right: 200px;
  bottom: 15px;
  text-align: center;
}
img {
  height: 350px;
  margin: auto;
}
</style>

---

# record4s と tapir の連携

### 感想

- case class 定義を簡略化するだけで、コード量が減りメンテナンスしやすくなるのではないかと感じた
- マクロを使っているので、コンパイル時間への注意は必要
- Scala 3.5.0 で導入予定の NamedTuple を使うモチベーションが高まった
- Scala 3、標準ライブラリの API と同じようにマクロが使えてすごい
