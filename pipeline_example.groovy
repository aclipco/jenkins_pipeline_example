node {
  properties([pipelineTriggers([cron('* 2 * * *')])])
  stage("Stage1"){
  echo "Hello Word"
}
stage("Stage2"){
  echo "Hello Word"}
}
stage("Stage3"){
  echo "Hello Word"}
}
stage("notifications to slack"){
  echo "Hello Word"
  slackSend channel: 'nagios_alerts', message: 'Completed'
  mail bcc: 'anastasiaclipco@gmail.com', body: 'message', cc: 'anastasiaclipco@gmail.com', from: '', replyTo: '', subject: 'test', to: 'anastasiaclipco@gmail.com'
  }
}