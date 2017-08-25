package docker.registry.acl

import docker.registry.AccessControl
import docker.registry.Role
import groovy.transform.ToString

@ToString(includeNames = true, includePackage = false)
class AuthResult {
  AuthResult(List roles, List acls, boolean valid = true) {
    this.roles = roles
    this.acls = acls
    this.valid = valid
    this.isAnonymous = false
  }

  AuthResult() {
    this(null, null, false, true)
  }

  final List<Role> roles
  final List<AccessControl> acls
  final boolean valid
  final boolean isAnonymous
}
