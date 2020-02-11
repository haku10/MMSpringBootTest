# MMSpringBootTest
### アプリについて
データベースはAmazon RDSを使用　ローカルからもアクセスできるように設定している<br>
設定例)<br>
SpringBoot情報<br>
application-development.properties<br>
spring.datasource.url=jdbc:mysql://RDSのインスタンスのエンドポイント:ポート番号/データベース名?sslMode=DISABLED<br>
※sslModeを無効にするのは証明書でエラーが起きて動かなくなるため<br>
spring.datasource.username=ユーザ名<br>
spring.datasource.password=パスワード
