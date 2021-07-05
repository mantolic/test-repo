// Exported from:        http://MacBook-Pro.local:5516/#/templates/Folder2d284cfb0338409e9fcae77d34380a2d-Release205d1938837246a8815dd4bd5e967d5d/code
// Release version:      10.1.2
// Date created:         Mon Jul 05 11:59:13 CEST 2021

xlr {
  template('template with trigger') {
    folder('test trigger')
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
        }
      }
    }
    
  }
}