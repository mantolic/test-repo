// Exported from:        http://Mateas-MacBook-Pro.local:5516/#/templates/Release93683813ad7d4f74b21e78983ef982d5/releasefile
// XL Release version:   8.1.0-SNAPSHOT
// Date created:         Thu Aug 09 14:45:22 CEST 2018

xlr {
  template('Template Outside Folder') {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-08-09T09:00:00+0200')
    phases {
      phase('New Phase') {
        
      }
    }
    teams {
      team('Template Owner') {
        members 'admin'
        permissions 'template#edit', 'template#lock_task', 'template#view', 'template#edit_triggers', 'template#edit_precondition', 'template#edit_security', 'template#create_release', 'template#edit_failure_handler'
      }
      team('Release Admin') {
        permissions 'release#edit_precondition', 'release#edit', 'release#reassign_task', 'release#edit_security', 'release#view', 'release#lock_task', 'release#start', 'release#edit_blackout', 'template#view', 'release#edit_failure_handler', 'release#abort', 'release#edit_task'
      }
    }
  }
}