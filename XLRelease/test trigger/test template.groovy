// Exported from:        http://MacBook-Pro.local:5516/#/templates/Folder2b5b201d8f30468db5a14162b2cb7acd-Release4d759e88e877442bb7e7ef38d79e5f22/code
// Release version:      10.2.0-SNAPSHOT
// Date created:         Mon Jul 05 10:59:00 CEST 2021

xlr {
  template('test template') {
    folder('test trigger')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-07-05T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('t') {
            
          }
        }
      }
    }
    
  }
}