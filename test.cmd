@echo off
setlocal

if [%1]==[] (
  gradle test
  goto:eof
)

if [%1]==[index] (
  explorer "build\reports\tests\test\index.html"
  if exist "build\spock-reports\index.html" (
    explorer "build\spock-reports\index.html"
  )
  if exist "build\jacoco.html\index.html" (
    explorer "build\jacoco.html\index.html"
  )
  goto:eof
)
if [%1]==[report] (
  gradle jacocoTestReport
  goto:eof
)

gradle test --tests %*
gradle jacocoTestReport