package net.kaleidos.taiga.mapper

import net.kaleidos.domain.Attachment
import net.kaleidos.domain.History
import net.kaleidos.domain.Issue
import net.kaleidos.domain.Project

class Mappers {

    static map(Project project) {
        new ProjectMapper().map(project)
    }

    static map(Issue issue) {
        new IssueMapper().map(issue)
    }

    static map(Attachment attachment) {
        new AttachmentMapper().map(attachment)
    }

    static map(History history) {
        new HistoryMapper().map(history)
    }
}