// Exported from:        http://MacBook-Pro.local:5516/#/templates/Folder2b5b201d8f30468db5a14162b2cb7acd-Release4d759e88e877442bb7e7ef38d79e5f22/code
// Release version:      10.2.0-SNAPSHOT
// Date created:         Mon Jul 05 11:03:01 CEST 2021

xlr {
  template('test template') {
    folder('test trigger')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-07-05T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('t') {
            comments {
              comment {
                text 'some commnet'
                author 'admin'
                date Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-07-05T11:02:06+0200')
                creationDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-07-05T11:02:06+0200')
              }
            }
            attachments {
              attachment("sql:Attachment9f8be0041d7e4276868476fc3c890c97") {
                filename "attachments/Attachment9f8be0041d7e4276868476fc3c890c97-🌈 Icon color.svg"
              }
            }
          }
        }
      }
    }
    
  }
}