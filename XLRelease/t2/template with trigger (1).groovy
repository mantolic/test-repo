// Exported from:        http://MacBook-Pro.local:5516/#/templates/Folder7851c9eabebe4b9ca75f372ea782e859-Releaseb9c95555630d4008a326e0b397150d98/code
// Release version:      10.2.0-SNAPSHOT
// Date created:         Mon Jul 05 14:27:25 CEST 2021

xlr {
  template('template with trigger (1)') {
    folder('t2')
    variables {
      stringVariable('commit') {
        
      }
    }
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-07-05T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('first task') {
            comments {
              comment {
                text 'first comment'
                author 'admin'
                date Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-07-05T11:56:26+0200')
                creationDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-07-05T11:56:26+0200')
              }
            }
            attachments {
              attachment("sql:Attachment4784580e3d744633b0d2c32b0853bcab") {
                filename "attachments/Attachment4784580e3d744633b0d2c32b0853bcab-🌈 Icon color.svg"
              }
            }
          }
          userInput('second task') {
            description 'Please enter the required information below.'
            variables {
              variable 'commit'
            }
          }
          custom('t3') {
            attachments {
              attachment("sql:Attachment662ef079d8454350958aab98d60b44cb") {
                filename "attachments/Attachment662ef079d8454350958aab98d60b44cb-tmpl_temp.yaml"
              }
            }
            script {
              type 'remoteScript.Unix'
              
            }
          }
        }
      }
    }
    
  }
}