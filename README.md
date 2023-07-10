# Spring Bootプロジェクトを作成

## 概要

### Initializer
はじめにInitializerにて、<br>
- プロジェクトのビルドシステム（Maven ,Gradle）
- 使用する言語
- Spring Bootバージョン（セマンティック）
- メタデータ（プロジェクト名、パッケージング、Java SDKなど）
を指定し、プロジェクトzipファイルをダウンロード。
- 
### (おまけ)Spring Boot CLIを使った環境構築
毎回Initializerからダウンロードしてディレクトリに落とすのが面倒に感じたので、Reactを触っていた頃に
Node.jsをインストールしてcreate-react-appで簡単にできていたのを思い出して、同じようなものがありそうだと思い調査。
案の定Spring Boot CLIを発見。
以下の手順を実践して試しにプロジェクトを作成したら同じ構成を再現できた。

- SDKMAN!を使ってSpring Bootをインストール<br>
``$ curl -s "https://get.sdkman.io" | bash ``<br>
  ```
  $ sdk install springboot $ spring --version
  Spring CLI v3.1.1
  ```
  注）後から調べたら、MacならSDKMAN!を入れずともHomebrewで簡単にインストールできたらしい。。
  ```
  $ brew tap spring-io/tap
  $ brew install spring-boot
  ```
  
- CLIでプロジェクトの初期化
  ```
  $ spring init オプション
  ```
  オプションはInitializerと同じになるようにコマンド入力。<br>

  参考リンク<br>
  Spring Boot CLI https://spring.pleiades.io/spring-boot/docs/current/reference/html/cli.html <br>
  SDKMAN! https://sdkman.io/

### プロジェクト
中身
```agsl
-プロジェクトのルートディレクトリ
    -gradle
    -src
    -.gitignore
    -build.gradle
    -gradlew.bat
    -HELP.md
    -setting.gradle
```
- Hello Springと表示するシンプルなプロジェクトを実行<br>
＊実行するとルートディレクトリ下にbuildフォルダが作成される。

## 動作確認
<img width="1837" alt="スクリーンショット 2023-07-11 1 44 54" src="https://github.com/masehideki/Java-6/assets/135149708/a2c3f786-62d3-46c4-a40c-ebf0911737ad">

<img width="372" alt="スクリーンショット 2023-07-11 1 45 54" src="https://github.com/masehideki/Java-6/assets/135149708/cd119015-7002-4547-99e1-9c2d794e4a27">

## 学び
・セマンティックバージョニング：

メジャー（後方互換性無し）.マイナー（後方互換性を伴う機能性）.パッチ（後方互換性を伴うバグ修正）

・MVCモデル（Model-View-Controller）

Javaをやる前にProgateでRuby on Railsを結構やったのが今役立ってて嬉しい。
とにかくようやくのアプリケーション開発ステージにテンションが上がる。。。
