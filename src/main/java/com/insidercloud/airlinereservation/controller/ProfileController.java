package com.insidercloud.airlinereservation.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for requests to the {@code /profile} resource. Populates the model with the claims
 * from the {@linkplain OidcUser} for use by the view.
 */
@Controller
public class ProfileController {

  @GetMapping("/dashboard")
  public String profile(Model model, @AuthenticationPrincipal OidcUser oidcUser) {
    model.addAttribute("title", "Dashboard");
    model.addAttribute("profile", oidcUser.getClaims());
    return "profile";
  }
}
