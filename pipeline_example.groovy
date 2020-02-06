node {
  properties([pipelineTriggers([cron('* 2 * * *')])])
  stage("Pull Repo"){
  echo "Hello Word"
}
stage("Deploy to Dev"){
  echo "Hello Word"}
}
stage("Wait"){
  input 'Deploy to QA?'}

stage("Deploy to QA"){
  echo "Hello Word"}
}
stage("notifications to slack"){
  echo "Hello Word"
  slackSend channel: 'nagios_alerts', message: 'Completed'
  mail bcc: 'anastasiaclipco@gmail.com', body: 'message', cc: 'anastasiaclipco@gmail.com', from: '', replyTo: '', subject: 'test', to: 'anastasiaclipco@gmail.com'
  }
}