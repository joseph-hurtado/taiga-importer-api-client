package net.kaleidos.domain

import groovy.transform.ToString
import groovy.transform.builder.Builder
import groovy.transform.builder.SimpleStrategy

@ToString
@Builder(builderStrategy = SimpleStrategy)
// tag::issue[]
class Issue {
    Long ref

    String type
    String status
    String priority
    String severity

    String subject
    String description
    Project project

    String owner
    Date createdDate

    List<Attachment> attachments

    List<History> history
}
// end::issue[]