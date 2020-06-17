// Exported from:        http://mateas-mac:5517/970/#/templates/Folderbd3b1ebd17ab4ab2886cc138db82fed6-Release1e0d2d54ccc8447aa57fc4712600882a/releasefile
// Release version:      9.7.0-616.113
// Date created:         Wed Jun 17 09:42:51 CEST 2020

xlr {
  template('scm template') {
    folder('Samples')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2020-06-17T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('m1') {
            attachments {
              attachment("sql:Attachment918b6d8158c84caf86557a28b4a8ada1") {
                filename "attachments/Attachment918b6d8158c84caf86557a28b4a8ada1-scm template.groovy"
              }
            }
          }
          notification('notification') {
            attachments {
              attachment("sql:Attachment67b15321c34a415e9db7ab9d97853512") {
                filename "attachments/Attachment67b15321c34a415e9db7ab9d97853512-20200219_133403.jpg"
              }
            }
          }
        }
      }
    }
    
  }
}