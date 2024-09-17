브런치를 3개를 만들어서 진행을 한다.

branch : main ,dev ,test 

맨처음에 깃 저장소를 연결 git remote origin add "주소"

git add . -> git commit -m "first commit" -> git push origin main 

git branch dev -> git branch -> git checkout dev -> 여기에서 작업 -> git add 자바 파일 -> git commit -m "feat : 개발기능 추가 -> 자세한 설명....." -> git push origin dev 

git branch test -> git checkout test -> git merge dev -> 검증 -> git add 자바파일 -> git commit -m "test : ㅌㅌㅌ 테스트 코드 작성" ->git push origin test 

git checkout main -> git merge dev -> git merge test -> git commit -m "comment : 브랜치 병합" ->git push origin main
