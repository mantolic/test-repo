// Exported from:        http://MacBook-Pro.local:5517/101/#/templates/Folder09aeb33894cb44e792aabb53bc851df2-Release65b44ede21dc461aa19060cf65e9de87/code
// Release version:      10.1.2
// Date created:         Mon Jul 05 15:32:24 CEST 2021

xlr {
  template('template with trigger') {
    folder('test trigger')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-07-05T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('manual') {
            comments {
              comment {
                text 'my commment'
                author 'admin'
                date Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-07-05T15:30:01+0200')
                creationDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-07-05T15:30:01+0200')
              }
              comment {
                text 'my commment'
                author 'admin'
                date Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-07-05T15:30:01+0200')
                creationDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-07-05T15:30:01+0200')
              }
            }
            attachments {
              attachment("sql:Attachment7b9767294d3548a08037d86a3240358e") {
                filename "attachments/Attachment7b9767294d3548a08037d86a3240358e-🌈 Icon color.svg"
              }
            }
          }
        }
      }
    }
    
  }
}