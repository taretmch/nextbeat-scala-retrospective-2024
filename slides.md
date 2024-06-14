---
theme: seriph
title: ScalaMatsuri 2024 の発表振り返り
class: text-center
highlighter: shiki
drawings:
  persist: false
transition: slide-left
mdc: true
layout: intro
---

# <span style="font-size: 3.5rem;">ScalaMatsuri 2024 の発表振り返り</span>

NB-Scala レトロスペクティブ (#NextMatsuri) - 2024年6月14日<br>
株式会社ネクストビート 溝上友貴

---

# 自己紹介

- ScalaMatsuri には2021年から参加🏮
- Scala 実務経験5年目
- 社内の共通ライブラリ (Scala, TypeScript, Capacitor) や認証基盤を担当

<div class="image-container">
  <img src="/images/icon.png" />
  <div class="links">
    <a href="https://twitter.com/taretmch" target="_blank">@taretmch</a>
    <a href="https://github.com/taretmch" target="_blank">github</a>
  </div>
</div>

<style>
.image-container {
  position: absolute;
  top: 160px;
  right: 80px;
}
img {
  height: 150px;
  margin: auto;
}
.links {
  margin-top: 10px;
  text-align: center;
  color: #0077b5;
}
.links a:not(:first-child) {
  margin-left: 10px;
}
</style>

---

# 会社紹介

- 株式会社ネクストビート
- <span v-mark.underline.orange>人口減少社会</span>をメインテーマに、保育園/法人向け SaaS、シェアリングエコノミー、子育てメディア、保育/宿泊業界のHR求人応募システムなど様々な事業を展開している
- 使用技術: Scala (2.12, 2.13, 3), TypeScript (Svelte, NestJS, Angular, ...), ...
- [会社紹介資料](https://speakerdeck.com/nextbeat/company-profile)
- 毎週木曜日20:00〜22:00、この場所でバー ([Nextbeat Hub](https://www.nextbeat.co.jp/recruit/nextbeat-hub)) を開いています🥃

---

# 本日の発表の目標

- ScalaMatsuri 2024 の発表を振り返り、実務にどう応用できるか考える
- ScalaMatsuri に行けなかったけど、行った気になれる
- 来年は参加してみたい！という気持ちになる

---

# ScalaMatsuri 2024 お疲れさまでした！

<style>
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

<style>
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

- 英語の発表も多く、グローバルな雰囲気
- Scala 好きの人が集まる熱気
- 広い会場、豪華なノベルティ
- 美味しいお弁当とコーヒー

<div class="image-1">
  <img src="https://i-assets-io-github-taretmch.s3.ap-northeast-1.amazonaws.com/nextbeat-matsuri-2024/IMG_0006.png" />
</div>

<div class="image-2">
  <img src="/images/badge.png" />
  <p>素敵な Scala のバッジも</p>
</div>

<style>
.image-1 {
  position: absolute;
  right: 250px;
  bottom: 100px;
}
.image-1 img {
  height: 200px;
  margin: auto;
}
.image-2 {
  position: absolute;
  right: 50px;
  bottom: 50px;
}
.image-2 img {
  height: 200px;
  margin: auto;
}
.image-2 p {
  text-align: center;
}
</style>

<!--
- 昨年ハイブリッドでオフライン参加したが、雰囲気が全く違った
- 両日とも楽しすぎてあっという間に終わった
- 発表、質疑応答時の英語 <-> 日本語の同時通訳があって、英語が不安でも楽しめた
  - レシーバーの配布、マイクの運搬お疲れさまでした...
- 会場が広く、また、座るのが辛くなかった
- ノベルティが豪華だった
- お昼の弁当、コーヒーが美味しかった
- 懇親会 🍺
- 懇親会での交流も楽しかった。やはり Scala バージョン更新に苦労している方 (会社) が多かった
-->

---

# ScalaMatsuri 2024 の感想

### 発表について

- 同時通訳あり、英語が不安でも楽しめた
- Scala 3 の進化を実感
- Opaque types, Coursier, tapir の発音を学んだ

|  |  |
| --- | --- |
| opaque | オペーク |
| coursier  | クルシェ |
| tapir | タピア |

<!--
- Scala のビルドツール、ライブラリ、エコシステムの進化を学ぶことができた
- Scala 3, scala-cli を使ったものが多かった
- Scala 3 は生産性が高い、書いていて楽しい、Scala 2 よりも理解しやすい。もっと流行らせたい
- 業務アプリケーションを全て Scala 3 にあげたくなった
-->

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
- 飛び込みカンファレンス

---

# ScalaMatsuri 2024 の発表一覧 (Day 2)

- [Scala ビルド時間の最適化](https://speakerdeck.com/bishabosha/optimising-scala-3-build-times-scala-matsuri)
- [Property-based testing: テストライブラリ活用方法](https://slides.com/magdastozek/property-based-testing-scala-20-min)
- [実務で使えるScala初心者向けTips](https://docs.google.com/presentation/d/e/2PACX-1vSP9jbfKrRj0K4TaSCFfZGsfuufvYXI2Wx2MqVI7eHhagXstuBt0DjSF2sp6bncSA/pub)
- [作って学ぶ Extensible Effects](https://docs.google.com/presentation/d/1raybiE8Otk2nreKDyRHoF1HK50K9K-fjL8-37QK8kW4/edit)
- Ox を用いた Direct-Style Scala
- [いつ継承を使い、いつ使わないのか](https://gakuzzzz.github.io/slides/when_to_use_subtyping_when_not_to_use/#1)
- 飛び込みカンファレンス

---

# com.lihaoyi エコシステムによる簡単Scalaプログラミング

- <span v-click>ライブラリ作成者 lihaoyi さんによる Scala のライブラリ群の紹介と、その歴史の話</span>
- <span v-click>Cats, ZIO などのライブラリを使わずに、Scala のコアライブラリだけでエコシステムを築き上げている</span>
- <span v-click>Python のようなシンプルな記法で書くことができるのが特徴</span>
- <span v-click>com.lihaoyi のライブラリを組み合わせることで、様々なアプリケーションを作ることができる</span>
  - <span v-after>[組み合わせの一覧 📝](https://www.lihaoyi.com/post/12yearsofthecomlihaoyiScalaPlatform.html#the-comlihaoyi-platform-has-built-out-a-third-way) (スクショはこのリンクから作成)</span>

<div v-after class="image-container">
  <img src="/images/lihaoyi-cheat-sheet.png" />
</div>

<style>
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
  - <span v-click>Syntax, Enums, トップレベル定義, リリースサイクル, Scala CLI</span>
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
import io.circe.syntax.*

val r = %(name = "taretmch", age = 20)
println(r)                                    // - %(name = taretmch, age = 20)
println(r.name)                               // - taretmch
println(r.asJson.noSpaces)                    // - {"name":"taretmch","age":20}
println(r + (email = "taretmch@example.com")) // - %(name = taretmch, age = 20, email = taretmch@example.com)
```

</div>

<!--
- circe, upickle などの JSON ライブラリとの連携も可能
-->

---

# record4s --- Scala 3のための拡張可能レコード、そして構造的型によるドメインモデリング

### 感想

- 構造的型の便利さを知った
- よく request/response のデータ型を case class で量産しているが、record4s で定義することでコード量を減らせそう
  - 実際にやってみたが、Record に対する型クラスを用意すると便利だった

---

# 日本語埋め込みモデルを Scala から使うには何が必要か.

- <span v-click>自然言語処理において、日本語埋め込みモデルを Scala から使用する方法についての話</span>
- <span v-click>Java のライブラリを通じて、Scala で日本語埋め込みモデルに対して自然言語処理することができる</span>

<br>

<div v-click>

### 感想

- Python だとワンライナーでできるが、Scala でやることのロマンを感じた
- JVM のエコシステムは強みだと感じた
- 難しかった

</div>

---

# Ironライブラリで守られた型安全性

- <span v-click>制約を型として表現する、Refinement type のためのライブラリ (Scala 2 だと [refined](https://github.com/fthomas/refined) が有名)</span>

<div v-click>

```scala
// name はアルファベットのみ、age は 0 より大きい
case class User(name: String :| Alphanumeric, age: Int :| Greater[0])

def createUser(name: String, age: Int): Either[String, User] =
  for {
    n <- name.refineEither[Alphanumeric]
    a <- age.refineEither[Greater[0]]
  } yield User(n, a)
println(createUser("taretmch", 20))  // Right(User(taretmch,20))
println(createUser("_taretmch", 20)) // Left(Should be alphanumeric)
println(createUser("taretmch", 0))   // Left(Should be greater than 0)
```

</div>

<br>

<div v-click>

### 感想

- 制約を型として表現するとわかりやすいし、コンパイル時にエラーが出るので開発しやすい
- 後の発表のプロパティベーステストと組み合わせるとコードの信頼性が高まりそう

</div>

---

# 数値ライブラリで始める安全なプログラミング

- <span v-click>[typelevel/spire](https://github.com/typelevel/spire) の紹介</span>
- <span v-click>Double、BigDecimal などの数値型を扱うとき、計算途中に丸められて全体の計算精度が落ちることがある</span>
- <span v-click>途中式に精度を入れず、計算結果の出力に精度を持たせることで、安全な数値計算ができる</span>

<br>

<div v-click>

### Rational 型

- 有理数の表現

```scala
import spire.math.Rational
import java.math.RoundingMode.HALF_UP

val `1/2` = Rational(1, 2)
val `1/3` = Rational(1, 3)
val `5/6` = `1/2` + `1/3`
println(`5/6`.toBigDecimal(5, HALF_UP))
// 0.83333
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
  - <span v-after>Option 型の null safe</span>
  - <span v-after>パターンマッチング</span>
  - <span v-after>中置記法 (infix, 配列のコレクションメソッド)</span>
  - <span v-after>implicit の表現力 (Scala 3 だと given, using, extension, Conversion)</span>
- <span v-click>Scala を始めるためにピッタリのリンク集</span>
  - <span v-after>[GitHub](https://github.com/KristianLentino99/ScalaMatsuri2024)</span>

<br>

<div v-click>

### 感想

- Scala では当たり前になっていることの良さを確認できた
- 中置記法のような記法は直感的で、コードの可読性が上がる

</div>

---

# Scalaの開発者ツールエコシステム

- 開発者ツールについての紹介

|  |  |
| --- | --- |
| [Metals](https://scalameta.org/metals/) | LSP (Language Server Protocol) |
| [Coursier](https://get-coursier.io/) | Java依存関係の管理 |
| [Scalafmt](https://scalameta.org/scalafmt/) | フォーマッター |
| [Scala Steward](https://github.com/scala-steward-org/scala-steward) | 依存ライブラリのバージョン更新 |
| [Scalameta](https://scalameta.org/) | AST、semanticdb |
| [WartRemover](https://www.wartremover.org/) | リンター |
| [Scalafix](https://scalacenter.github.io/scalafix/) | リファクタリング |
| [Scala CLI](https://scala-cli.virtuslab.org/) | 簡単にコード実行 |
| [Scastie](https://scastie.scala-lang.org/) | オンラインコード共有 |
| [mdoc](https://scalameta.org/mdoc/) | ドキュメント内でコード実行 |
| [Scala Toolkit](https://docs.scala-lang.org/toolkit/introduction.html) | http、jsonなど基本的な依存が入ったツール群 |

<style>
td {
  font-size: 0.8rem;
  padding: 0.3rem 0.5rem;
}
</style>

<!--
- Metals, ScalaCLI チームの人！
-->

---

# Scalaの開発者ツールエコシステム

### 感想

- スライドがクイズ形式で楽しかった
- 個々の紹介はあっても一覧で見ることは少なかったので、ありがたかった

---

# Scala ビルド時間の最適化

- <span v-click>Scala のビルドツールに関しての話</span>
- <span v-click>コンパイルのレイヤー (e.g. sbt -> zinc -> scalac) 、フェーズを意識することでビルド時間を短縮できる</span>
  - <span v-click>プロジェクトの分割 (1プロジェクト20ファイルくらいが良いらしい)、依存関係の整理による並行ビルド</span>
- <span v-click>Scala 3.4.0 ではビルドの進捗状況表示、キャンセルの機能が追加された</span>
- <span v-click>Scala 3.5.0 ではパイプラインビルドが導入される ([Scala 2, sbt 1.4 からのポーティング](https://xuwei-k.hatenablog.com/entry/2020/10/24/020950))</span>

<!--
scala center の Jamie Thompson さんによる発表
-->

<br>

<div v-click>

### 感想

- プロダクションコードのビルド時間を解析してみた
  - 綺麗に分割されているプロジェクトほど並行ビルドされており、ビルド時間が短縮されていた
  - 一方でプロジェクト自体が肥大化して依存関係が汚くなると、直列でビルドが行われビルド時間が長くなっていた
- プロダクションコードをパイプラインビルドしてみた
  - コンパイル時間が200秒だったところ、140秒に短縮された (60秒も!)
- 開発生産性のためにも、sbt プロジェクトのアーキテクチャを見直すことが重要だと感じた

</div>

---

# Property-based testing: テストライブラリ活用方法

- <span v-click>プロパティベーステストの話</span>
  - <span v-click>満たすべき性質を定義し、テストを自動生成する</span>
  - <span v-click>テストデータの生成規則を定義する</span>
- <span v-click>Scala のライブラリには [ScalaCheck](https://scalacheck.org/) がある</span>

<div v-click>

```scala
// 例: 0〜100 までの整数
val smallInteger = Gen.choose(0,100)
(1 to 10).foreach(_ => println(smallInteger.sample))
// サンプル: Some(77), Some(74), Some(6), Some(67), Some(8), Some(13), Some(77), Some(56), Some(64), Some(40)
```

</div>

- <span v-click>非常に強力だが、テスト対象に応じて、例を使ったテストとプロパティベーステストを使い分けるのが重要</span>
  - <span v-click>例を使ったテストから始める</span>
  - <span v-click>重要なコンポーネントに対してはプロパティベーステストに移行していく</span>

---

# Property-based testing: テストライブラリ活用方法

### 感想

- Iron もそうだが、対象の性質を静的に表現することのわかりやすさが良い
- 発表であったように、プロパティベーステストは適切なタイミングで使い分けよう

---

# 実務で使えるScala初心者向けTips

- <span v-click>Scala 初心者に向けた Tips の紹介</span>
  - <span v-click>実行時エラーを起こすものは避ける (`Option.empty[A].get`, `Seq.empty[A].head`)</span>
  - <span v-click>コレクション型の操作は高階関数を使おう (`forall`, `exists`, ...)</span>
  - <span v-click>flatMap の波動拳の代わりに for 糖衣構文を使おう</span>
  - <span v-click>Enum のパターンマッチでは `case _` を使わないようにしよう (大事)</span>

<div v-after>
```scala
enum Color:
  case Red, Green, Blue

def getEmojiNotGood(color: Color): String = color match
  case Color.Red => "🔴"
  case Color.Green => "🟢"
  case _ => "🔵" // Color に新しいケースが追加されたときにコンパイルエラーにならない

def getEmojiGood(color: Color): String = color match
  case Color.Red => "🔴"
  case Color.Green => "🟢"
  case Color.Blue => "🔵" // Color に新しいケースが追加されたときにコンパイルエラーになる
```
</div>

- <span v-click>[まとめスライド](https://docs.google.com/presentation/d/e/2PACX-1vSP9jbfKrRj0K4TaSCFfZGsfuufvYXI2Wx2MqVI7eHhagXstuBt0DjSF2sp6bncSA/pub?slide=id.p37)</span>

---

# 実務で使えるScala初心者向けTips

### 感想

- Option や Seq で値があることがわかっているのであれば、NonEmptyList などの型で保証すると良い
- 慣れてない方だと実務でもたまに見かけるコードがあるので、ちゃんとレビューで落とそう
- レビューされる前に自分で気づけるようになろう

---

# 作って学ぶ Extensible Effects

- <span v-click>エフェクトシステムの実装である Extensible Effects (Eff) をどう作るか考える話</span>
- <span v-click>アセンブリ言語の命令セットを処理する機械を紐解いていくと、Eff の仕組みが理解できる(らしい)</span>
- <span v-click>何か語れるほど理解していないので、[スライド](https://docs.google.com/presentation/d/1raybiE8Otk2nreKDyRHoF1HK50K9K-fjL8-37QK8kW4/edit#slide=id.p)を見てください</span>

<div v-click>

<br>

### 感想

- 難しくて脳が疲れたけど、アセンブリ言語→インタープリタ→Eff という流れが面白かった
- 来年こそは、発表を完全理解して頷けるように精進する

</div>

---

# Ox を用いた Direct-Style Scala

- <span v-click>手続き的な記法で並行プログラミングを行うためのライブラリ [Ox](https://github.com/softwaremill/ox)</span>
- <span v-click>Project Loom、Go のライブラリ jox が参考にされている</span>

<div v-click>

```scala
import ox.*
import scala.concurrent.duration.*

def computation1: Int = {
  sleep(2.seconds)
  1
}
def computation2: String = {
  sleep(1.second)
  "2"
}
val resultPar: (Int, String) = par(computation1, computation2)
println(resultPar)
// (1, "2")
```

</div>

<br>

<div v-click>

### 感想

- 手続き型のように書けるのは Scala 未経験者にも優しい

</div>

---

# いつ継承を使い、いつ使わないのか

- <span v-click>サブタイピングと代数的データ型の使い分けについての話</span>
- <span v-click>モデルの構造と操作に着目するとわかりやすい</span>

<div v-click>
```scala
// サブタイピングは、新しい構造 (サブクラス) を追加しやすい
// 一方で、Shape に対して新しい操作を追加すると、既存のコードにも影響が出る
trait Shape:
  def area: Double

class Circle(val radius: Double) extends Shape:
  def area: Double = math.Pi * radius * radius
class Rectangle(val width: Double, val height: Double) extends Shape:
  def area: Double = width * height
```
</div>

- <span v-click>サブタイピングは以下のケースに向いている</span>
  - <span v-click>ActiveRecord のように操作を1つのレイヤーで隠蔽できる場合</span>
  - <span v-click>フレームワークやライブラリなど、データ構造の定義を委ねる場合</span>

---

# いつ継承を使い、いつ使わないのか

```scala
// 代数的データ型は、構造 (ケース) を追加すると既存のコードに影響が出る (コンパイルエラーにはなる)
// 一方で、新しい操作は追加しやすい
enum ShapeADT:
  case Circle(radius: Double)
  case Rectangle(width: Double, height: Double)

def area(shape: ShapeADT): Double = shape match
  case ShapeADT.Circle(radius) => math.Pi * radius * radius
  case ShapeADT.Rectangle(width, height) => width * height
```

- <span v-click>代数的データ型は以下のケースに向いている</span>
  - <span v-click>レイヤードアーキテクチャを採用するような、一定規模以上のアプリケーション</span>

---

# いつ継承を使い、いつ使わないのか

### 感想

- "保守性が高くなりそう" って感覚の言語化
- 継承は、アーキテクチャによって使い分けることが重要

---

# まとめ

- <span v-click>Scala のビルドツール、ライブラリ、エコシステムは日々進化している。その進化を実感できる場として ScalaMatsuri は最適</span>
- <span v-click>今年は、Scala の基礎から応用、コンパイラ、ライブラリまで幅広いトピックが取り上げられた</span>
- <span v-click>2019年以来のオフライン開催で、会場の雰囲気、熱気は最高だった</span>
- <span v-click>Scala 3 は生産性が高い、書いていて楽しい、Scala 2 よりも理解しやすい。もっと流行らせたい</span>

---

# 時間余ったら: record4s と tapir の連携

- [tapir](https://github.com/softwaremill/tapir) は、エンドポイントの定義を型安全に行うためのライブラリ
- tapir は、以下のようにエンドポイントを定義する

```scala {|4,5,11,12}
import sttp.tapir.*
import sttp.tapir.json.circe._

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

```scala {|11,13,14}
import com.github.tarao.record4s.*
import com.github.tarao.record4s.circe.Codec.encoder
import com.github.tarao.record4s.circe.Codec.decoder

import sttp.tapir.*
import sttp.tapir.json.circe._

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

<div class="left-container">

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

- カラム数が28以上になると `Maximal number of successive inlines (32) exceeded` と怒られるので注意

</div>

<div class="image-container">
  <img src="/images/openapi_sample.png" />
  <p>OpenAPI の出力例</p>
</div>

<style>
.left-container {
  width: 80%;
}
.image-container {
  position: absolute;
  right: 50px;
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
- Scala 3.5.0 で試験導入予定の NamedTuple を使うモチベーションが高まった
- Scala 3、標準ライブラリの API と同じようにマクロが使えてすごい
