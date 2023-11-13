---
  layout: default.md
  title: "Zhang Yiheng's Project Portfolio Page"
---

### Project: HealthSync
HealthSync is an application designed to streamline the workflow of healthcare center frontdesk staff by allowing them to efficiently register and access patient information within 2-3 minutes. It offers a user-friendly platform that enhances patient management, appointment scheduling, and health record retrieval, ultimately improving care delivery and saving valuable time for healthcare professionals.

Given below are my contributions to the project.

* **New Feature**: Added shortcuts for commands.
  * What it does: Allows the user to use shortcuts for all the commands.
  * Justification: This feature improves the product significantly because this feature allows the user to use shortcuts for all the commands. This is useful for the user as they can use shortcuts to execute commands faster.
  * Note: Shortcuts for `log`, `clog` and `alog` was implemented by another team member.

* **Code contributed**: [RepoSense link](https://nus-cs2103-ay2324s1.github.io/tp-dashboard/?search=nubnubyas&breakdown=false&sort=groupTitle%20dsc&sortWithin=title&since=2023-09-22&timeframe=commit&mergegroup=&groupSelect=groupByRepos)

* **Project management**:
  * Helped with assigning labels for issues from PE-D.
  * Helped with renaming usage of `person` in code to `patient` as much as possible in comments and documentation to minimize confusion.

* **Enhancements to existing features**:

  * Enhance the `delete` feature to allow deletion of specified fields and deletion by name or IC
    * What it Does: Allows users to delete a patient by their IC or name instead of index. Allows the user to delete specified fields such as the appointment and medical history of a patient. Users can specify which medical history to delete.
    * Justification: This feature improves the product significantly because it allows the user to delete patients by their IC or name instead of index. This is more intuitive and convenient for the user. It also allows the user to delete specified fields. This is useful for the user as they can delete the specified details of a patient without deleting the patient's other details.
  * Enhance `delete` and `edit` feature to affect original list after `find` command.
    * What it Does: Allows users to edit or delete a patient without having to go back to the original list if they are currently in a filtered list after a find command.
    * Justification: This feature improves the efficiency of users as they will not have to return to the original list everytime. This enhancement works well with the logger tab since the logger tab can save records of find command, hence aidding the deletion of patients through already filtered list of patients.

<div style="page-break-after: always;"></div>

* **Documentation**:
  * User Guide:
    * Enhance introduction of the UG. [\#140](https://github.com/AY2324S1-CS2103T-T14-3/tp/pull/140)
    * Added shortcut column to command summary. [\#104](https://github.com/AY2324S1-CS2103T-T14-3/tp/pull/104)
    * Added documentation for the features `delete` [\#72](https://github.com/AY2324S1-CS2103T-T14-3/tp/pull/72)
    * Update command formats of features to aid users and prevent confusion. [\#204](https://github.com/AY2324S1-CS2103T-T14-3/tp/pull/204)
    * Update description of features to better match the actual functionality of HealthSync. [\#204](https://github.com/AY2324S1-CS2103T-T14-3/tp/pull/204)
  * Developer Guide:
    * Updated Glossary. [\#58](https://github.com/AY2324S1-CS2103T-T14-3/tp/pull/58)
    * Added implementation details of the `delete` feature. [\#102](https://github.com/AY2324S1-CS2103T-T14-3/tp/pull/102)
    * Update UML diagrams to match project architecture and workflow. [\#245](https://github.com/AY2324S1-CS2103T-T14-3/tp/pull/245)

* **Community**:
  * PRs reviewed (with non-trivial review comments): [\#62](https://github.com/AY2324S1-CS2103T-T14-3/tp/pull/62), [\#105](https://github.com/AY2324S1-CS2103T-T14-3/tp/pull/105), [\#109](https://github.com/AY2324S1-CS2103T-T14-3/tp/pull/109), [\#117](https://github.com/AY2324S1-CS2103T-T14-3/tp/pull/117), [\#198](https://github.com/AY2324S1-CS2103T-T14-3/tp/pull/198), [\#209](https://github.com/AY2324S1-CS2103T-T14-3/tp/pull/209), [\#211](https://github.com/AY2324S1-CS2103T-T14-3/tp/pull/211), [\#217](https://github.com/AY2324S1-CS2103T-T14-3/tp/pull/217)
  * Reported bugs and suggestions for other teams in the course (Issues examples: [#1](https://github.com/nubnubyas/ped/issues/1), [#2](https://github.com/nubnubyas/ped/issues/2), [#3](https://github.com/nubnubyas/ped/issues/3), [#4](https://github.com/nubnubyas/ped/issues/4), [#5](https://github.com/nubnubyas/ped/issues/5), [#6](https://github.com/nubnubyas/ped/issues/6), [#7](https://github.com/nubnubyas/ped/issues/7), [#8](https://github.com/nubnubyas/ped/issues/8), [#9](https://github.com/nubnubyas/ped/issues/9), [#10](https://github.com/nubnubyas/ped/issues/10), [#11](https://github.com/nubnubyas/ped/issues/11))
