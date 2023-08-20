import io.jvm.uuid.UUID

object Example {
  def returnRandomUUIDString(): String = UUID.randomUUID().toString
}
