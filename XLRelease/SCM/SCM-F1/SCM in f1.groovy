// Exported from:        http://Mateas-MBP:5516/#/templates/Folder9224c94606e149319d98c0f199224784-Folder2c24ff675ce5467690d8586205379948-Releaseb7463bee883e4f6bb59170976da5bfd5/releasefile
// XL Release version:   8.1.0-SNAPSHOT
// Date created:         Wed Aug 08 13:24:35 CEST 2018

xlr {
  template('SCM in f1') {
    folder('SCM/SCM-F1')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-08-02T09:00:00+0200')
    phases {
      phase('Phase') {
        color '#0099CC'
        tasks {
          createRelease('t1') {
            
          }
        }
      }
    }
    
  }
}