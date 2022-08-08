# 서경대 SW 하계특강 1조

## 1. Git을 설치합니다.
[링크](https://taewow.tistory.com/13)를 클릭하셔서 보면서 설치해보세요 ! 그대로 따라하시면 됩니다.

## 2. 자신이 깃허브 업로드(Push)용으로 사용할 폴더를 정합니다.
저의 경우 `E 드라이브`에  `[서경대] SW 스프링 특강`이라는 폴더를 생성했습니다.

## 3. 해당 폴더에 들어가 `우클릭` - `Git Bash Here` 선택

![image](https://user-images.githubusercontent.com/89104369/183458193-089fe5b4-25bc-41c2-86de-603e4dcf047f.png)
위와 같은 창이 나타납니다.

## 4. 리포지토리 url 주소를 복사합니다.

![image](https://user-images.githubusercontent.com/89104369/183458691-dc4980b6-4cc6-4424-922e-e6007def5e93.png)

`sku-sw-summer-spring-special-lecture`의 `code` - `HTTPS` 주소를 복사하시면 됩니다.

## 5. 아까 전 git bash에서 다음의 명령어를 실행합니다.

```
git clone [리포지토리 url 주소]
```
이번에는 모두가 같은 url 주소를 입력할 것이므로, 입력하게 되는 명령어는 다음과 같습니다.
```
git clone https://github.com/heoj10272/sku-sw-summer-spring-special-lecture.git
```
위 명령어를 그대로 복사하셔서 사용하셔도 상관없습니다. <br>
하지만, git bash에서는 `ctrl`+`v`가 먹히지 않으므로 `우클릭` - `Paste` 하시면 됩니다.

명령어 입력후 엔터를 치시면 git bash를 했던 폴더에 리포지토리의 모든 데이터가 복사됩니다.

## 6. java 워크스페이스 이동

실습하고 계신 워크스페이스 폴더 (특강 때 강사님을 따라 그대로 생성하셨다면 `c:\sku\workspace)를 자신의 이름이 적힌 폴더 내부로 이동시킵니다. <br>
저의 경우 `허재영` 폴더 내에 `workspace`폴더가 이동되었습니다.

## 7. 실습 환경

이제 Eclipse IDE를 실행 -> 워크스페이스를 지정하는 창에서 자신의 이름 폴더 아래의 워크스페이스를 지정하시거나, 

![image](https://user-images.githubusercontent.com/89104369/183461064-3531e6da-0282-4174-aa80-01673d246fcb.png)
![image](https://user-images.githubusercontent.com/89104369/183461314-a01d5e08-ca83-4ff9-a759-da868673db90.png)

위 이미지 처럼 `File` - `Open Projects from File System` 클릭 후 `Directory` - `workspace` 폴더를 선택하시면 됩니다.

## 8. 실습을 마친 후 리퍼지토리에 업로드(Push)

무턱대고 업로드하면 다른 사람의 반영이 덮어씌워지거나, 최악의 경우 실수로 데이터를 지우고 푸쉬할 경우 데이터가 영영 소실될 수 있습니다.

따라서 각자 branch를 생성하여, 해당 branch로 PR(Pull Request)를 하면 제가 병합(merge)하는 과정으로 진행합니다.

### 8.1 branch 생성하기

자신의 branch를 생성하기 위해 git bash에서 다음 명령어를 입력합니다.

```
git branch [branch 이름]
```

branch 이름은 자신의 영어 이름으로 하겠습니다. <br>
저의 경우는 `jaeyoung` 입니다.

다음 명령어로 branch 목록을 확인할 수 있습니다.
```
git branch
```
기본은 `main` branch입니다.

다음 명렁어로 자신이 생성한 branch로 이동합니다.
```
git checkout [branch 이름]
```
저의 경우는 다음과 같습니다.
```
git checkout jaeyoung
```
위 명령어를 통해 branch가 이동되었습니다.

여기서 리포지토리에 Push하면 됩니다.

### 8.2 add, commit, push

push의 절차는 크게 세 개만 알면 됩니다. <br>
`add`, `commit`, `push`입니다.

먼저 다음 명령어를 입력합니다.
```
git add .
```
`add` 뒤에 한 칸 띄우고 `.`입니다. <br>
`.`은 모든 대상을 의미합니다.

이어서 다음 명령어입니다.
```
git commit -m "[commit 내용]"
```
여기서 [commit 내용]에는 `commit`시의 메시지가 들어가게 됩니다.

![image](https://user-images.githubusercontent.com/89104369/183463495-d285fe61-2de8-406a-b845-8443c3426028.png)

위 빨간 표시 부분에 들어갑니다.<br>
이 커밋 메시지를 아주 엄격하게 관리하는 곳도 있지만, 저희는 그냥 자유롭게 쓰도록 하겠습니다. <br>
귀찮으시면 `1` 이런식으로 하셔도 됩니다.

마지막으로 `push`입니다.
```
git push
```
여기까지 하셔도 아직 리포지토리에는 반영되지 않습니다.<br>
앞서 말씀드렸다시피 제가 `merge`를 해야 반영됩니다.<br>
그 요청(PR)을 해보겠습니다.<br>
![image](https://user-images.githubusercontent.com/89104369/183464843-f2379f3d-3d60-49ec-936f-71a49138c551.png)
상단 메뉴에서 자신의 branch를 선택

![image](https://user-images.githubusercontent.com/89104369/183465138-e1d997a6-7dbc-4511-9864-74db74ebebe8.png)

`1 commit ahead` 선택

![image](https://user-images.githubusercontent.com/89104369/183465376-3c57e337-c5c5-41c7-a1e8-fd41b2892c6f.png)

`Create pull request` 선택

![image](https://user-images.githubusercontent.com/89104369/183465580-ebf85a95-215e-49a6-81e6-944df6c9be2c.png)

PR명, PR내용을 작성하고 `Create pull request`를 클릭합니다.
여기까지 하면 끝입니다.
나머지는 제가 PR을 보고 merge를 하면 리포지토리에 반영됩니다.

주의하실 점은 최초 `clone` 이후 실습을 진행하거나 수정하시기 전에 반드시 git bash에서 `git pull`을 하셔서 코드를 당겨오셔야 합니다.
아마 현재 자신의 데이터가 최신이 아니라면 어차피 `push`되지 않을 것이고 `branch`도 나누어 놓았기에 괜찮겠지만, 만일을 대비하는 차원에서 부탁드립니다.

이렇게 써놓았지만 사실 저도 협업 리포지토리를 짜보는건 오랜만이라, 최대한 처음 하는 입장에서 설명드렸음에도 불구하고 진행하시다가 오류가 생기실수도 있을 것 같습니다.
오류가 생긴다면 구글링 하시거나 저에게 물어보시면 아는 한 도와드리겠습니다.

추가로 만약에 자신의 실습 환경이 자택 데스크탑인데 학교 컴퓨터로도 실습하고 싶다고 하시면, 위에서 `clone`했던 것 처럼 학교 PC에도 Git을 설치한 후 똑같이 진행하시면 됩니다.



