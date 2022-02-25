package net.wiringbits

import com.alexitc.materialui.facade.csstype.mod.{BoxSizingProperty, FlexDirectionProperty, PositionProperty}
import com.alexitc.materialui.facade.materialUiCore.anon._
import com.alexitc.materialui.facade.materialUiCore.createMuiThemeMod.{Theme, ThemeOptions}
import com.alexitc.materialui.facade.materialUiCore.createPaletteMod.{PaletteColorOptions, PaletteOptions}
import com.alexitc.materialui.facade.materialUiCore.createTypographyMod.TypographyOptions
import com.alexitc.materialui.facade.materialUiCore.overridesMod.Overrides
import com.alexitc.materialui.facade.materialUiCore.propsMod.ComponentsProps
import com.alexitc.materialui.facade.materialUiCore.shapeMod.ShapeOptions
import com.alexitc.materialui.facade.materialUiCore.stylesMod.createMuiTheme
import com.alexitc.materialui.facade.materialUiCore.withStylesMod.CSSProperties

// scalafmt is having issues formatting this file, we need to create a bug report
object AppTheme {
  val typography = TypographyOptions().setUseNextVariants(true)
  val borderRadius = 8

  object Colors {
    val primary = "#192038"
    val secondary = "#353A62"
    val background2 = "#0D1328"
    val primaryText = "#ffffff"
    val secondaryText = "#C3C5CB"

  }

  val value: Theme = createMuiTheme(
    ThemeOptions()
      .setPalette(
        PaletteOptions()
          .setPrimary(PaletteColorOptions.SimplePaletteColorOptions(Colors.primary))
          .setSecondary(PaletteColorOptions.SimplePaletteColorOptions(Colors.secondary))
          .setBackground(
            PartialTypeBackground()
              .setPaper("#0D1328 0% 0% no-repeat padding-box")
          )
          .setText(PartialTypeText().setPrimary(Colors.primaryText).setSecondary(Colors.secondaryText))
          .set(
            "backgroundButton",
            "transparent linear-gradient(90deg, #1D96EC 0%, #1254DD 100%) 0% 0% no-repeat padding-box"
          )
          .setDivider("#192038")
      )
      .setTypography(typography)
      .setShape(ShapeOptions().setBorderRadius(borderRadius))
      .setProps(
        ComponentsProps()
          .setMuiPaper(
            PartialPaperProps()
              .setElevation(1)
          )
      )
      .setOverrides(
        Overrides()
          .setMuiPaper(
            PartialStyleRulesPaperCla()
              .setRoot(
                CSSProperties()
                  .setBackground(Colors.background2)
                  .setPosition(PositionProperty.relative)
                  .setDisplay("flex")
                  .setFlexDirection(FlexDirectionProperty.column)
                  .setBoxSizing(BoxSizingProperty.`border-box`)
                  .setOverflow("hidden")
              )
              .setRounded(CSSProperties().setBorderRadius(borderRadius))
          )
          .setMuiButton(
            PartialStyleRulesButtonCl()
              .setContainedPrimary(
                CSSProperties()
                  .setBackground(
                    "transparent linear-gradient(90deg, #1D96EC 0%, #1254DD 100%) 0% 0% no-repeat padding-box"
                  )
                  .set("&$disabled", CSSProperties().setOpacity("0.5"))
              )
              .setContained( CSSProperties()
                .set("&$disabled", CSSProperties()
                  .setColor(Colors.secondaryText)
                  .setOpacity("0.5"))
              )
              .setTextPrimary(CSSProperties()
                .setColor ("#1389FF"))
          )
          .setMuiExpansionPanelSummary(
            PartialStyleRulesExpansioContent().setExpandIcon(CSSProperties().setColor(Colors.primaryText))
          )
          .setMuiInput(
            PartialStyleRulesInputCla()
              .set("&$focused", CSSProperties().setColor(Colors.secondaryText))
              .set("&$disabled", CSSProperties().setColor(Colors.secondaryText))
          )
          .setMuiInputLabel(
            PartialStyleRulesInputLab()
              .setOutlined(
                CSSProperties()
                  .set("&$focused", CSSProperties().setColor("yellow"))
                  .set("&$disabled", CSSProperties().setColor("cyan"))
              )
          )
          .setMuiOutlinedInput(
            PartialStyleRulesOutlined().setRoot(CSSProperties()
              .set("&$notchedOutline",CSSProperties().setBorderColor("yellow"))
              .set("&$disabled $notchedOutline",CSSProperties().setColor(Colors.secondaryText).setBorderColor("#1389FF"))
              .set("&$focused $notchedOutline",CSSProperties().setColor(Colors.secondaryText).setBorderColor("#1389FF"))
              .set("&$disabled", CSSProperties().setColor(Colors.secondaryText).setOpacity("0.5")))
          )
          .setMuiLink(PartialStyleRulesLinkClas().setRoot(CSSProperties().setColor("#1389FF")))
          .setMuiTableCell(PartialStyleRulesTableCel().setBody(CSSProperties().setBorder("none")))
          .setMuiCssBaseline(
            PartialStyleRulesCssBasel().set(
              "@global",
              CSSProperties()
                .set(
                  "body",
                  CSSProperties()
                    .setBackgroundImage("url('BG3.svg')")
                    .setColor(Colors.primaryText)
                )
            )
          )
      )
  )
}
