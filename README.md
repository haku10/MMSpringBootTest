# MMSpringBootTest
### アプリについて
データベースはAmazon RDSを使用　ローカルからもアクセスできるように設定している
設定例)
SpringBoot情報
application-development.properties
spring.datasource.url=jdbc:mysql://RDSのインスタンスのエンドポイント:ポート番号/データベース名?sslMode=DISABLED
※sslModeを無効にするのは証明書でエラーが起きて動かなくなるため
spring.datasource.username=ユーザ名
spring.datasource.password=パスワード
