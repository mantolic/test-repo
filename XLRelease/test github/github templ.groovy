// Exported from:        http://MacBook-Pro.local:5517/101/#/templates/Folder708eda79151d4de6a02d16f33dd10049-Release99ef716fa077430a83d7b2ff2a0de5e6/code
// Release version:      10.1.2
// Date created:         Mon Jul 05 18:06:41 CEST 2021

xlr {
  template('github templ') {
    folder('test github')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-07-05T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('task') {
            comments {
              comment {
                text 'test'
                author 'admin'
                date Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-07-05T18:06:08+0200')
                creationDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-07-05T18:06:08+0200')
              }
            }
            attachments {
              attachment("sql:Attachment260027719ba8477e9a9cb3f4cea4f682") {
                filename "attachments/Attachment260027719ba8477e9a9cb3f4cea4f682-tmpl_temp.yaml"
              }
            }
          }
        }
      }
    }
    
  }
}